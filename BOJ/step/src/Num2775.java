import java.util.Scanner;

public class Num2775 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int Num = scanner.nextInt();

        int[][] apt = new int[15][15];

        for(int i = 0; i < 15; i++){
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j < 15; j++){
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        for(int i = 0; i < Num; i++){

            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(apt[k][n]);

        }

    }


}
