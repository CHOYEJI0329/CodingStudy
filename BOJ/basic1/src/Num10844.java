import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10844 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//      d[N][L] = d[N-1][L+1] + d[N-1][L-1]
        int[][] d = new int[N+1][10];

        for(int i = 1; i < 10; i++){
            d[1][i] = 1;
        }

        for(int i = 2; i < N+1; i++){
            for(int j = 0; j < 10; j++) {
                if(j > 8) d[i][j] = d[i-1][j-1] % 1000000000;
                else if(j < 1) d[i][j] = d[i-1][j+1] % 1000000000;
                else d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % 1000000000;
            }
        }

        long result = 0;
        for(int i = 0; i < 10; i++){
            result+=d[N][i] % 1000000000;
        }

        System.out.println(result % 1000000000);
    }

}
