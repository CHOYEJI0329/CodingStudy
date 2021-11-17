import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2193_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] d = new long[91];

        d[1] = d[2] = 1;
        for(int i = 3; i < 91; i++){
            d[i] = d[i-1] + d[i-2];
        }

        System.out.println(d[N]);
    }

}
