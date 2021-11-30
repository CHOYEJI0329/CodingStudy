import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] array = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }

        sum = sum-100;
        Arrays.sort(array);

        good: for(int i = 0; i < 9; i++){
            for(int j = i; j < 9; j++){
                if(array[i] + array[j] == sum){
                    array[i] = array[j] = -1;
                    break good;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if(array[i] != -1){
                sb.append(array[i]).append("\n");
            }
        }

        System.out.println(sb);

    }

}
