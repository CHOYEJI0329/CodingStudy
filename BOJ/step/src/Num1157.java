import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();
        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                array[s.charAt(i) - 'a']++;
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                array[s.charAt(i) - 'A']++;
            }

        }

        int max = -1;
        char answer = 'A';
        for(int i = 0; i < 26; i++){

            if(array[i] > max){
                max = array[i];
                answer = (char) (i + 'A');
            }else if(array[i] == max) answer = '?';

        }

        System.out.printf("%c", answer);

    }


}
