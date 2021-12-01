import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1476_my {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int earth = 0;
        int sun = 0;
        int moon = 0;
        roof: while (true){

            while (earth + E <= sun + S){
                if(earth + E == sun + S){
                    while (moon + M <= sun + S){
                        if(moon + M == sun + S){
                            if(moon + M == sun + S){
                                System.out.println(sun + S);
                                break roof;
                            }
                        }
                        moon += 19;
                    }
                }
                earth += 15;
            }
            sun += 28;
        }

    }

}
