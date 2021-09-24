import java.util.Scanner;

public class Num2941 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String arpa = scanner.nextLine();
        int count = arpa.length();

        for(int i = 0; i < arpa.length()-1; i++){
            for(int j = 0; j < array.length; j++){
                if(arpa.substring(i, i+2).equals(array[j])){
                    count--;
                }
            }
        }
        for(int i = 0; i < arpa.length()-2; i++){
            for(int j = 0; j < array.length; j++){
                if(arpa.substring(i, i+3).equals(array[j])){
                    count--;
                }
            }
        }

        System.out.println(count);



    }


}
