import java.util.Scanner;

public class Num2292 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        int layer = 6;
        int start = 1;

        int count = 1;
        while (Num > 1){

            start+=layer;
            layer+=6;
            count++;
            if(Num < start+1){
                break;
            }

        }

        System.out.println(count);


    }


}
