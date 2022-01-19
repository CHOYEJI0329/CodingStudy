import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num6064 {

//  이거 시간 지난 후 다시 해보자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            /*int answer = x;
            int a = x; int b = x;

            while (a != x || b != y){

                b = b+M;
                if(b > N) b%=N;
                answer+=M;

                if(b + M - a == M) {
                    answer = -1;
                    break;
                }

            }*/

            int answer = 0;
            boolean result = false;
            for(int j = x; j < (M*N); j+=M){
                if(j % N == y){
                    answer = j+1;
                    result = true;
                    break;
                }
            }

            if(!result){
                answer = -1;
            }

            sb.append(answer).append("\n");

        }

        System.out.println(sb);
    }


}
