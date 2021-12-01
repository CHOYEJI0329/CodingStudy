import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int earth = 1, sun = 1, moon = 1, answer = 1;

        while (true){

            if(earth == E && sun == S && moon == M){
                System.out.println(answer);
                break;
            }
            answer++; earth++; sun++; moon++;

            if(earth == 16) earth = 1;
            if(sun == 29) sun = 1;
            if(moon == 20) moon = 1;

        }

    }

}
