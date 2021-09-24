import java.util.Scanner;

public class Num3009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] xArray = new int[4];
        int[] yArray = new int[4];
        for(int i = 0; i < 3; i++){
            xArray[i] = scanner.nextInt();
            yArray[i] = scanner.nextInt();
        }

        if(xArray[0] == xArray[1]) xArray[3] = xArray[2];
        else if(xArray[0] == xArray[2]) xArray[3] = xArray[1];
        else xArray[3] = xArray[0];

        if(yArray[0] == yArray[1]) yArray[3] = yArray[2];
        else if(yArray[0] == yArray[2]) yArray[3] = yArray[1];
        else yArray[3] = yArray[0];

        System.out.printf("%d %d", xArray[3], yArray[3]);


    }


}
