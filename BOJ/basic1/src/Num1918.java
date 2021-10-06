import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1918 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        while (count < s.length()){

            if( 'A' <= s.charAt(count) && s.charAt(count) <= 'Z') {
                sb.append(s.charAt(count));
                count++;
            }else if(s.charAt(count) == '('){
                stack.push('(');
                count++;
            }else if(s.charAt(count) == ')'){

                while (!stack.empty()){
                    char pop = stack.pop();
                    if(pop == '(') break;
                    sb.append(pop);
                }
                count++;

            }else{

                while (!stack.empty() && precedence(stack.peek()) >= precedence(s.charAt(count))){
                    char pop = stack.pop();
                    sb.append(pop);
                }
                stack.push(s.charAt(count));
                count++;
            }

        }

        while (!stack.empty()){
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }

    static int precedence(char c){

        if(c == '(' || c == ')'){
            return 0;
        }else if(c == '+' || c == '-'){
            return 1;
        }else{
            return 2;
        }

    }

}
