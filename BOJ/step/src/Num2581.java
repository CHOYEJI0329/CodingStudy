import java.util.Scanner;

public class Num2581 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int min = 0;
        int plus = 0;

        good: for(int i = M; i < N+1; i++){

            if(i == 1) continue good;
            for(int j = 2; j < i; j++){
                if(i % j == 0) continue good;
            }
            if(plus == 0) min = i;
            plus += i;

        }

        if(plus == 0){
            System.out.println(-1);
        }else {
            System.out.println(plus);
            System.out.println(min);
        }
    }


}
