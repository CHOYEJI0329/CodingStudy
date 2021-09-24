import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        int N = 0;
        int answer = 0;
        answer: for(int i = 0; i < M; i++){
            N = i;
            int j = i;
            while (true){
                N += (j % 10);
                j /= 10;
                if(j == 0) {
                    if(M == N){
                        answer = i;
                        break answer;
                    }
                    break;
                }
            }

        }

        System.out.println(answer);


    }




}

