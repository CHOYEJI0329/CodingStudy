import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num17103 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        boolean[] array = new boolean[1000001];
        array[0] = array[1] = true;
        for(int i = 2; i < array.length; i++){
            for(int j = i+i; j < array.length; j+=i){
                array[j] = true;
            }
        }

        for(int i = 0; i < T; i++){

            int count = 0;
            int N = Integer.parseInt(br.readLine());
            for (int j = 2; j < N/2+1; j++){
                if(!array[j] && !array[N-j]){
                    count++;
                }
            }

            sb.append(count).append("\n");

        }

        System.out.println(sb);

    }

}
