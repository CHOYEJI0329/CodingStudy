import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num9012 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            ArrayList<Character> stack = new ArrayList<>();
            int count = -1;
            String answer = null;

            String s = br.readLine();
            for(int j = 0; j < s.length(); j++){

                if (answer == null){
                    if(s.charAt(j) == '('){
                        push(stack);
                        count++;
                    }else if(s.charAt(j) == ')'){
                        answer = pop(stack, count);
                        count--;
                    }
                }


            }
            if(answer == null){
                if(stack.isEmpty()){
                    answer = "YES";
                }else{
                    answer = "NO";
                }
            }
            sb.append(answer).append("\n");

        }

        System.out.println(sb);
    }

    static private void push(ArrayList<Character> stack){
        stack.add('(');
    }

    static private String pop(ArrayList<Character> stack, int count){
        String answer = null;
        if(!stack.isEmpty()){
            stack.remove(count);
        }else{
            answer = "NO";
        }

        return answer;

    }



}
