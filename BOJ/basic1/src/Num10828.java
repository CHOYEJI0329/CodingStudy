import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num10828 {

    static ArrayList<Integer> stack = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }

        }

        System.out.println(sb);



    }

    private static void push(int num){
        stack.add(num);
    }

    private static void pop(){
        if(stack.size() == 0){
            sb.append(-1).append("\n");
        }else{
            sb.append(stack.get(stack.size()-1)).append("\n");
            stack.remove((stack.size()-1));
        }
    }

    private static void size(){

        sb.append(stack.size()).append("\n");
    }

    private static void empty(){

        if(stack.size() == 0){
            sb.append(1).append("\n");
        }else{
            sb.append(0).append("\n");
        }

    }

    private static void top(){

        if(stack.size() == 0){
            sb.append("-1").append("\n");
        }else{
            sb.append(stack.get(stack.size() - 1)).append("\n");
        }

    }

}
