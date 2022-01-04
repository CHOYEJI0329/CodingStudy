import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1107 {

    static boolean[] broken;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        broken = new boolean[10];

        for(int i = 0; i < 10; i++){
            broken[i] = true;
        }

        int f = Integer.parseInt(br.readLine());
        if(f > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < f; i++) {
                broken[Integer.parseInt(st.nextToken())] = false;
            }
        }

        int answer = 1000000;
        for(int c = 0; c <= 1000000; c++){
            int len = possible(c);
            if(len > 0){
                answer = Math.min(answer, Math.abs(N - c) + len);
            }

        }

        answer = Math.min(Math.abs(N - 100), answer);

        System.out.println(answer);

    }

    static public int possible(int c){

        int len = 0;
        if(c == 0) {
            if(!broken[0]) return 0;
            else return 1;
        }
        while (c > 0){
            if(!broken[c % 10]) return 0;
            len++;
            c /= 10;
        }

        return len;
    }

}
