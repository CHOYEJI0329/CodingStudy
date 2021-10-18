import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1929 {


    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] array = new boolean[N+1];
        for(int i = 2; i < N+1; i++){
            array[i] = true;
        }

        for(int i = 2; i < N+1; i++){
            if(array[i]) {
                for (int j = i + i; j < N+1; j += i) {
                    array[j] = false;
                }
            }
        }

        for(int i = M; i < N+1; i++){
            if(array[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);


    }

}
