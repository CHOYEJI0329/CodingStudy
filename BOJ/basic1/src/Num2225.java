import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num2225 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] array = new long[K+1][N+1];
        array[0][0] = 1L;
        for(int i = 1; i < K+1; i++){
            for(int j = 0; j < N+1; j++){
                for(int p = 0; p < j+1; p++) {
                    array[i][j] += array[i - 1][j - p];
                    array[i][j] %= 1000000000;
                }
            }
        }

        System.out.println(array[K][N]);


    }

}
