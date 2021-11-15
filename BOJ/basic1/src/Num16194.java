import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num16194 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] array = new int[T+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < T+1; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[T+1];
        for(int i = 0; i < T+1; i++){
            d[i] = 1000 * 10000;
        }
        d[0] = 0;
        for(int i = 1; i < T+1; i++){
            for(int j = 1; j < i+1; j++) {
                d[i] = Math.min(d[i], d[i-j] + array[j]);
            }
        }

        System.out.println(d[T]);

    }

}
