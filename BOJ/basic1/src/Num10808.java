import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10808 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++){

            int a = s.charAt(i) - 'a';
            array[a]++;

        }

        for(int i = 0; i < array.length; i++){
            sb.append(array[i]).append(" ");
        }

        System.out.println(sb);

    }

}
