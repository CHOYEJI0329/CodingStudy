import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);
        for(int i = 1; i < N; i++){

            while (!stack.empty() && array[stack.peek()] < array[i]){
                answer[stack.peek()] = array[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.empty()){
            answer[stack.peek()] = -1;
            stack.pop();
        }

        for(int i = 0; i < answer.length; i++){
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);

    }

}
