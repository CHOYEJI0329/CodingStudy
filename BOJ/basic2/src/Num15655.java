import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num15655 {

    static int[] a; static boolean[] b; static int[] c;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        a = new int[M]; b = new boolean[N]; c = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            c[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(c);
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

        for(int i = 0; i < N; i++){
            if(b[i]) continue;
            if(index != 0 && a[index-1] > c[i]) continue;
            b[i] = true;
            a[index] = c[i];
            go(index+1, N, M);
            b[i] = false;
        }


    }

}
