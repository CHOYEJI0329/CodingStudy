import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num10799 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                answer+=stack.size();
            }else if(s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            }else if(s.charAt(i-1) != '(' && s.charAt(i) == ')'){
                stack.pop();
                answer++;
            }

        }

        System.out.println(answer);

    }

}
