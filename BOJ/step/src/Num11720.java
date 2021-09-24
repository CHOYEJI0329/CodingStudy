import java.util.Scanner;

public class Num11720 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String Num = scanner.next();
        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += Num.charAt(i) - '0';
        }

        System.out.printf("%d" ,sum);
    }


}
