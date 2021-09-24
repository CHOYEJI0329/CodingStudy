import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3053 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        System.out.printf("%.6f\n%.6f", R*R*3.14159265359, 2.0*R*R);



    }




}