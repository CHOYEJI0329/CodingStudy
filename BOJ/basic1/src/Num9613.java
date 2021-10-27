import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num9613 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] array = new int[n];
            for (int j = 0; j < n; j++){
                array[j] = Integer.parseInt(st.nextToken());
            }

            long answer = 0;
            for(int j = 0; j < n-1; j++){
                for(int e = j+1; e < n; e++){
                    answer += GCD(array[j], array[e]);
                }
            }

            sb.append(answer).append("\n");

        }
        System.out.println(sb);

    }

    static public int GCD(int a, int b){

        if(b == 0) return a;

        return GCD(b, a%b);
    }

}
