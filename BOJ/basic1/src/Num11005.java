import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11005 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(N == 0){
            sb.append(0);
        }
        while (N > 0){

            int num = N % B;
            if(num > 9){
                char c = (char) (num + 55);
                sb.append(c);
            }else{
                sb.append(num);
            }
            N /= B;
        }

        System.out.println(sb.reverse());

    }

}
