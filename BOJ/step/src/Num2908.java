import java.util.Scanner;

public class Num2908 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int newA = 0;
        int v = 100;
        for(int i = 0; i < 3; i++){
            newA += (a % 10) * v;
            a /= 10;
            v /= 10;
        }

        int newB = 0;
        int v2 = 100;
        for(int i = 0; i < 3; i++){
            newB += (b % 10) * v2;
            b /= 10;
            v2 /= 10;
        }

        if(newA > newB){
            System.out.println(newA);
        }else if(newB > newA)
            System.out.println(newB);

    }


}
