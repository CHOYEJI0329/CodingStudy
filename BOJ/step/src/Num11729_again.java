import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11729_again {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        sb.append((int) Math.pow(2,K) -1).append("\n");

        hanoi(K, 1, 2, 3);
        System.out.println(sb);


    }

    public static void hanoi(int k, int start, int mid, int to){

        if(k == 1){
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        hanoi(k-1, start, to, mid);

        sb.append(start).append(" ").append(to).append("\n");

        hanoi(k-1, mid, start, to);



    }




}

