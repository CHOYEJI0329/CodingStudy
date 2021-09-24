import java.util.Scanner;

public class Num1193 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int count = 1;
        int first = 1;
        int second = 1;
        int i = 2;

        roop: while(N > 1){

            if(i%2 == 0){
                first = 0;
                second = i+1;
                for(int j = 0; j < i; j++){
                    first++;
                    second--;
                    count++;
                    if(count == N) break roop;
                }
            }else{
                first = i+1;
                second = 0;
                for(int j = 0; j < i; j++){
                    first--;
                    second++;
                    count++;
                    if(count == N) break roop;
                }
            }
            i++;

        }

        System.out.printf("%d/%d", first, second);



    }


}
