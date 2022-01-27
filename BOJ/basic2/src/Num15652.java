import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15652 {

    static int[] a;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        a = new int[10];
        go(0, N, M);

        System.out.println(sb);

    }

    public static void go(int index, int N, int M){

        if(index == M){
            for(int i = 0; i < M; i++){
                sb.append(a[i]);
                if(i != M-1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i < N+1; i++){
            if(index != 0 && a[index-1] > i) continue;
            a[index] = i;
            go(index+1, N, M);
        }


    }

}
