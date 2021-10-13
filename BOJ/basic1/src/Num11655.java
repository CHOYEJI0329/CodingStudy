import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11655 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());

        for(int i = 0; i < sb.length(); i++){

            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){

                int a;
                int b = sb.charAt(i) + 13;
                if(b > 'z'){
                    a = b - 'z';
                    b = a + 96;
                }

                sb.setCharAt(i, (char)b);
            }else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
                int a;
                int b = sb.charAt(i) + 13;
                if(b > 'Z'){
                    a = b - 'Z';
                    b = a + 64;
                }

                sb.setCharAt(i, (char)b);
            }

        }


        System.out.println(sb);

    }

}
