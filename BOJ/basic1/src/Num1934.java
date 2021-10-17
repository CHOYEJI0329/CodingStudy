import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1934 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = 1;
            for(int j = 2; j < Math.min(a, b)+1; j++){
                if(a % j == 0 && b % j == 0){
                    gcd = j;
                }
            }

            int lcm = a * b / gcd;
            sb.append(lcm).append("\n");

        }

        System.out.println(sb);

    }

}
