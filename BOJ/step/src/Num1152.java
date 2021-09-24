import java.util.Scanner;

public class Num1152 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String[] array = s.split(" ");
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals("")) count++;
        }

        System.out.println(count);
    }


}
