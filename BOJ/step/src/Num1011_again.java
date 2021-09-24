import java.util.Scanner;

public class Num1011_again {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int distance = B - A;
            int max = (int) Math.sqrt(distance);

            if (max == Math.sqrt(distance)) {
                System.out.println(2 * max - 1);
            } else if (distance <= max * max + max)
                System.out.println(2 * max);
            else {
                System.out.println(max * 2 + 1);
            }
        }

    }


}
