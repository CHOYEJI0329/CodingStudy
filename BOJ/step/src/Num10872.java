import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = factory(N);

        System.out.println(result);

    }

    public static int factory(int N){

        int result = 1;
        if(N > 1) result = N * factory(N - 1);

        return result;
    }



}

