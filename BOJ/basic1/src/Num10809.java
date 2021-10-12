import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10809 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];

        String S = br.readLine();

        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        for(int i = 0; i < S.length(); i++){

            int c = S.charAt(i) - 'a';

            if(alphabet[c] == -1){
                alphabet[c] = i;
            }

        }

        for(int i = 0; i < alphabet.length; i++){
            sb.append(alphabet[i]).append(" ");
        }

        System.out.println(sb);



    }

}
