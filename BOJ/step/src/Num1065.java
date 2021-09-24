import java.util.Scanner;

public class Num1065 {

    public static int arithmetic_sequence(int N){

        int count;

        if(N < 100){
            count = N;
        }else{
            count = 99;

            if(N == 1000) N = 999;

            for(int i = 100; i < N+1; i++){

                int han = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if(han - ten == ten - one) count++;

            }

        }

        return count;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = arithmetic_sequence(N);

        System.out.println(count);
    }


}
