import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num11576 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] array = new int[m];
        for(int i = 0; i < m; i++){
            array[i] = Integer.parseInt(st2.nextToken());
        }

        int answer = array[0];
        for(int i = 1; i < array.length; i++){
            answer = answer * A + array[i];
        }

        if(answer == 0) sb.append(0);

        Stack<Integer> stack = new Stack<>();
        while (answer > 0){

            stack.push(answer % B);
            answer /= B;

        }

        while (!stack.empty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);

    }

}
