import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10820 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String s = br.readLine();
        while (s != null && !s.equals("")){

            int small = 0;
            int big = 0;
            int num = 0;
            int blank = 0;


            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if('a' <= c && c <= 'z'){
                    small++;
                }else if('A' <= c && c <= 'Z'){
                    big++;
                }else if('0' <= c && c <= '9'){
                    num++;
                }else if(c == ' '){
                    blank++;
                }

            }

            System.out.printf("%d %d %d %d\n", small, big, num, blank);

            count++;
            s = br.readLine();

        }




    }

}
