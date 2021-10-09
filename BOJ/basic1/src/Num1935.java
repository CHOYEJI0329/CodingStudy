import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1935 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] array = new int[N];
        double answer = 0;

        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                stack.push((double) array[s.charAt(i) - 'A']);
            }else{
                double pop2 = stack.pop();
                double pop = stack.pop();

                switch (s.charAt(i)){
                    case '+':
                        answer = pop + pop2;
                        break;
                    case '-':
                        answer = pop - pop2;
                        break;
                    case '/':
                        answer = pop / pop2;
                        break;
                    case  '*':
                        answer = pop * pop2;
                        break;
                }

                stack.push(answer);

            }

        }

        answer = stack.pop();
        System.out.printf("%.2f", answer);

    }

}
