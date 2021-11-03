import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2745 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int answer = 0;
        for(int i = 0; i < N.length(); i++){

            int num = N.charAt(i) - '0';
            if(num > 9){
                num -= 7;
            }

            answer = answer * B + num;

        }

        System.out.println(answer);

    }

}
