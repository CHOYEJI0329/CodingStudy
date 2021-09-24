import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = Fibonacci(N);

        System.out.println(result);

    }

    public static int Fibonacci(int N){

        int result = 0;
        if(N == 1) result = 1;
        else if(N > 1) result = Fibonacci(N-1) + Fibonacci(N-2);

        return result;
    }



}

