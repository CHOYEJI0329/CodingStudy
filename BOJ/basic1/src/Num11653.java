import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num = 2;
        while (N > 1){

            if(N % num == 0){
                sb.append(num).append("\n");
                N /= num;
            }else{
                num++;
            }

        }

        System.out.println(sb);


    }

}
