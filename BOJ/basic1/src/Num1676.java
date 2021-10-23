import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1676 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int fiveNum = factorialNum(N);

        System.out.println(fiveNum);

    }

    public static int factorialNum(int num){

        int fiveNum = 0;
        if(num > 1){
            fiveNum = factorialNum(num-1);
            int copy = num;
            while (copy % 5 == 0){
                copy /= 5;
                fiveNum++;
            }
        }

        return fiveNum;
    }


}
