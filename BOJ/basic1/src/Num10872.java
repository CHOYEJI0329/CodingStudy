import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = factorial(N);

        System.out.println(sum);

    }

    public static int factorial(int n){

        int sum = 1;
        if(n > 1){
            sum = n * factorial(n-1);
        }

        return sum;
    }



}
