import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11053 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[N];
        int result = 0;
        for(int i = 0; i < N; i++){
            d[i] = 1;
            for(int j = i-1; j > -1; j--){
                if(array[i] > array[j]){
                    d[i] = Math.max(d[i], 1 + d[j]);
                }
            }
            result = Math.max(result, d[i]);
        }

        System.out.println(result);
    }

}
