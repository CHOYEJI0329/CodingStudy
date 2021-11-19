import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1912 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] array = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }


        int[] dp = new int[T];
        int answer = dp[0] = array[0];
        for(int i = 1; i < T; i++) {
            dp[i] = dp[i - 1] + array[i];
            if (dp[i] < array[i]) {
                dp[i] = array[i];
            }
            answer = Math.max(dp[i], answer);
        }
        System.out.println(answer);

    }

}
