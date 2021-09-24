import java.util.Scanner;

public class Num2839_again {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = (N % 5);

        boolean result = true;
        if(N == 4 || N == 7){
            result = false;
        }

        if(!result) answer = -1;
        else{

            if(answer == 0){
                answer = (N / 5);
            }else if(answer == 1 || answer == 3){
                answer = (N / 5) + 1;
            }else if(answer == 2 || answer == 4){
                answer = (N/5) + 2;
            }

        }

        System.out.println(answer);



    }


}
