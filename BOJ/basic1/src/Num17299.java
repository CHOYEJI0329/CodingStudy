import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num17299 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] array = new int[N];
        int[] count = new int[1000001];
        int[] answer = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            count[array[i]]++;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < N; i++){

            while (!stack.empty() && count[array[stack.peek()]] < count[array[i]] ){
                answer[stack.peek()] = array[i];
                stack.pop();
            }

            stack.push(i);

        }

        while (!stack.empty()){
            answer[stack.peek()] = -1;
            stack.pop();
        }

        for(int i = 0; i < N; i++){
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);
    }

}
