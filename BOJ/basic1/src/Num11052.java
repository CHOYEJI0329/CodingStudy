import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[N+1];
        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < i+1; j++){
                d[i] = Math.max(d[i], d[i-j] + array[j]);
            }
        }

        System.out.println(d[N]);

    }

}
