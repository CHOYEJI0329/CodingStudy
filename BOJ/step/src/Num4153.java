import java.util.Scanner;

public class Num4153 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a == 0 && b == 0 && c == 0) break;
            if(a > b && a > c){
                if(a * a == b*b + c*c){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else if(b > a && b > c){
                if(b * b == a*a + c*c){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else{
                if(c * c == a*a + b*b){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }

        }

    }


}
