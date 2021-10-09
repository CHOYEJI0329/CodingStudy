import java.util.Scanner;

public class Num2675 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++){
            int N = scanner.nextInt();
            String s = scanner.next();

           for(int j = 0; j < s.length(); j++){
               for(int e = 0; e < N; e++){
                   System.out.printf("%c", s.charAt(j));
               }
           }
            System.out.println();

        }

    }

}
