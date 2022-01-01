import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1476_again {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = 1;
        int i = 0;
        while (E > 1 || S > 1 || M > 1){

            answer = i + E;
            int j = answer % 28;
            if(j == 0) j = 28;
            if(S != j){
                i+=15;
                continue;
            }
            j = answer % 19;
            if(j == 0) j = 19;
            if(M == j){
                break;
            }
            i+=15;

        }

        System.out.println(answer);

    }

}
