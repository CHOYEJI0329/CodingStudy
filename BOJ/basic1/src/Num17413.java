import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num17413 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        boolean tag = false;
        for(int i = 0; i < s.length();){

            if(s.charAt(i) == '<') {
                tag = true;
            }
            if(s.charAt(i) == ' '){
                sb.append(" ");
                i++;
            }
            if(s.charAt(i) == '>') {
                tag = false;
                sb.append(">");
                i++;
            }
            if(tag){
                sb.append(s.charAt(i));
                i++;
            }else{
                while(i < s.length() && s.charAt(i) != '<' && s.charAt(i) != ' ') {
                    stack.push(s.charAt(i));
                    i++;
                }
                while (stack.size() > 0){
                    char pop = stack.pop();
                    sb.append(pop);
                }
            }
        }


        System.out.println(sb);


    }
}
