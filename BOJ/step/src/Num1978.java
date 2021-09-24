import java.util.Scanner;

public class Num1978 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        good: for(int i = 0; i < N; i++) {

            int a = scanner.nextInt();

            for(int j = 2; j < a; j++){
                if(a % j == 0){
                    continue good;
                }
            }
            if(a != 1) count++;
        }

        System.out.println(count);

    }


}
