import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2089 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if(N == 0) answer.append(0);
        while (N != 0){

            if(N < 0){

                if(N % -2 == 0){
                    N /= -2;
                    answer.append(0);
                }else{
                    N = N / -2 + 1;
                    answer.append(1);
                }

            }else{

                answer.append(N % 2);
                N /= -2;

            }

        }

        System.out.println(answer.reverse());

    }

}
