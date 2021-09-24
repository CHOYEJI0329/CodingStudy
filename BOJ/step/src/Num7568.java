import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] array = new int[T];
        int[] x = new int[T];
        int[] y = new int[T];

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < T; i++){
            for(int j = 0; j < T; j++){
                if(x[i] < x[j] && y[i] < y[j]){
                    array[i]++;
                }

            }

        }

        for(int i = 0; i < T; i++){
            System.out.printf("%d ", array[i]+1);
        }


    }




}

