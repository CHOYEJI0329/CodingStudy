import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1978 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] array = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 0; i < T; i++){

            if(array[i] > 1){
                count++;
                for(int j = 2; j < array[i]; j++){
                    if(array[i] % j == 0) {
                        count--;
                        break;
                    }
                }
            }

        }

        System.out.println(count);
    }

}
