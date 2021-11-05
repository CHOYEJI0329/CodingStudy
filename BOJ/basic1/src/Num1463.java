import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1463 {

    static int[] num;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        num = new int[N+1];
        int count = func(N);

        System.out.println(count);
    }

    static int func(int N){

        if(N == 1) return 0;
        if(num[N] != 0) return num[N];
        num[N] = func(N-1) + 1;
        if(N % 2 == 0){
            int temp = func(N / 2) + 1;
            if(temp < num[N]){
                num[N] = temp;
            }
        }
        if(N % 3 == 0){
            int temp = func(N / 3) + 1;
            if(temp < num[N]){
                num[N] = temp;
            }
        }

        return num[N];
    }

}
