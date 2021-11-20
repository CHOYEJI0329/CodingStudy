import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1699 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        dp[1] = 1;
        for(int i = 1; i < N+1; i++){
            dp[i] = i;              // 최댓값
            for(int j = 1; j * j < i+1; j++){
                dp[i] = Math.min(dp[i],dp[i - j*j] + 1);  // 더 큰 수가 들어갈 수 있으므로 비교하여 작은 수를 남김.
            }
        }

        System.out.println(dp[N]);
    }

}
