import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1712 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        long amount = a;
        long sale = 0;
        int count = 0;

        if(b < c){
            while (true){

                amount+=b;
                sale += c;
                count++;
                if(amount < sale){
                    break;
                }
            }
        }else{
            count = -1;
        }

        System.out.println(count);


    }


}
