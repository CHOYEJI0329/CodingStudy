import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2309_again {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] array = new int[9];

        for(int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        int sum = 0;
        for(int i = 0; i < 9; i++){
            sum += array[i];
        }

        good: for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int plus = array[i] + array[j];
                if(sum - 100 == plus){
                    array[i] = array[j] = 0;
                    break good;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if(array[i] != 0) sb.append(array[i]).append("\n");
        }

        System.out.println(sb);
    }

}
