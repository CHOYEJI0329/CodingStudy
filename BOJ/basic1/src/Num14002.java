import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num14002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[N];
        int max_num = 0;
        int result = 0;
        for(int i = 0; i < N; i++){
            d[i] = 1;
            for(int j = i-1; j > -1; j--){
                if(array[i] > array[j]){
                    d[i] = Math.max(d[i], 1 + d[j]);
                }
            }
            int max = Math.max(result, d[i]);
            if(result < max) {
                result = max;
                max_num = i;
            }
        }

        System.out.println(result);
        Stack<Integer> v = new Stack<>();
        v.push(array[max_num]);
        for(int i = max_num; i > -1; i--){
            if(d[i] == d[max_num]-1){
                d[max_num]--;
                v.push(array[i]);
            }
        }

        while (!v.empty()){
            sb.append(v.pop()).append(" ");
        }
        System.out.println(sb);
    }

}
