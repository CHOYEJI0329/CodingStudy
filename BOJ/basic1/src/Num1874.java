import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num1874 {

    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int m = 0;
        int x = 0;
        boolean result = true;

        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());

            if(x > m){
                while(x > m){
                    push(++m);
                }
                pop();
            }else {

                if(stack.isEmpty()){
                    break;
                }

                int top = top();
                if (x != top) {
                    result = false;
                    break;
                }else{
                    pop();
                }
            }


        }

            if(result){
                System.out.println(sb);
            }else{
                System.out.println("NO");
            }

    }

    static private Integer top(){

        int top = 0;
        if(stack.size() != 0){
            top = stack.get(stack.size() - 1);
        }
        return top;
    }

    static private void pop (){

        stack.remove(stack.size() - 1);
        sb.append("-").append("\n");

    }

    static private void push(int num){
        stack.add(num);
        sb.append("+").append("\n");
    }

}
