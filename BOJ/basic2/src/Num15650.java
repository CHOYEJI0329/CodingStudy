import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다시 해보자.
public class Num15650 {

    static boolean[] c; static int[] a; static boolean num;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        c = new boolean[10];
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
            num = true;
            return;
        }

        for(int i = 1; i < N+1; i++){
            if(c[i]){continue; }
            c[i] = true;
            if(!num) if(a[i-1] >= i){continue; }
            if(a[0] == N - M + 2) break;
            a[index] = i;
            num = false;
            go(index+1, N, M);
            c[i] = false;
        }


    }

}
