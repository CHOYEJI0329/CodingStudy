import java.util.Scanner;

public class Num11653 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int i = 2;
        while(true){

            if((N % i) == 0){
                N /= i;
                System.out.println(i);
            }else i++;

            if(i > N) break;

        }
    }


}
