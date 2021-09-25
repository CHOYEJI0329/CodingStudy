import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num9093_stack {

    static StringBuilder sb = new StringBuilder();
    static ArrayList<Character> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < s.length; j++){
                for(int t = 0; t < s[j].length(); t++){
                    push(s[j].charAt(t));
                }
                for(int t = 0; t < s[j].length(); t++) {
                    pop();
                }
                sb.append(" ");
            }
            sb.append("\n");


        }

        System.out.println(sb);

    }

    private static void push(char c){
        stack.add(c);
    }

    private static void pop(){
        sb.append(stack.get(stack.size()-1));
        stack.remove((stack.size()-1));

    }

}
