import java.util.Scanner;

public class Num10250 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num = scanner.nextInt();

        for(int i = 0; i < Num; i++){

            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int X = (N%H) == 0 ? (N/H) : (N/H)+1;
            int Y = (N%H) == 0 ? H : (N%H);

            System.out.printf("%d%02d\n", Y, X);
        }

    }


}
