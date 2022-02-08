import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Num15663 {

    static int[] a; static boolean[] b; static int[] c; static LinkedHashSet<String> array;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        a = new int[M]; c = new int[N]; b = new boolean[N];
        array = new LinkedHashSet<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            c[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(c);
        go(0, N, M);

        Iterator<String> iter = array.iterator();
        while (iter.hasNext()){
            sb.append(iter.next()).append("\n");
        }

        System.out.println(sb);

    }

    public static void go(int index, int N, int M){

        if(index == M){
            String s = "";
            for(int i = 0; i < M; i++){
                s += a[i];
                if(i != M-1) s+= " ";
            }
            array.add(s);
            return;
        }

        for(int i = 0; i < N; i++){
            if(i > 0 && index == 0 && c[i-1] == c[i]) continue;

            if(b[i]) continue;
            b[i] = true;
            a[index] = c[i];
            go(index+1, N, M);
            b[i] = false;
        }

    }

}
