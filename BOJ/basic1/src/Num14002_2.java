import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 역추적 방법. v[i]에 j값을 넣어 전에 카운팅된 수의 인덱스 값을 확인하여 추적한다.
public class Num14002_2 {

    static StringBuilder sb = new StringBuilder();
    static int[] v;
    static int[] array;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[N];
        v = new int[N];
        int result = 0;
        int max_num = 0;
        for(int i = 0; i < N; i++){
            d[i] = 1;
            v[i] = -1;
            for(int j = i-1; j > -1; j--){
                if(array[i] > array[j]){
                    if(d[i] < 1 + d[j]){
                        v[i] = j;
                        d[i] = 1 + d[j];
                    }
                }
            }
            if(result < d[i]){
                result = d[i];
                max_num = i;
            }
        }

        System.out.println(result);

        go(max_num);
        System.out.println(sb);
    }

    static void go(int p){
        if(p == -1) return;
        go(v[p]);
        sb.append(array[p]).append(" ");
    }

}
