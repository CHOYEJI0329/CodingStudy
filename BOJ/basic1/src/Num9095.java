import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] d = new int[12];
        d[0] = 1;
        for(int i = 1; i < 12; i++){
            if(i < 3) d[i] = i;
            else d[i] = d[i-1] + d[i-2] + d[i-3];
        }
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){

            int n = Integer.parseInt(br.readLine());
            sb.append(d[n]).append("\n");

        }

        System.out.println(sb);
    }

}
