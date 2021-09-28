import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num1406 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Character> leftstack = new ArrayList<>();
        ArrayList<Character> rightstack = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            leftstack.add(s.charAt(i));
        }
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            switch (a){

                case "L":
                    if(leftstack.size() != 0){
                        char top = pop(leftstack);
                        push(rightstack, top);
                    }
                    break;
                case "D":
                    if(rightstack.size() != 0){
                        char top = pop(rightstack);
                        push(leftstack, top);
                    }
                    break;
                case "B":
                    if(leftstack.size() != 0){
                        pop(leftstack);
                    }
                    break;
                case "P":
                    char top = st.nextToken().charAt(0);
                    push(leftstack, top);
                    break;

            }


        }

        StringBuilder sb = new StringBuilder();
        sb.append(leftstack.toString().replace("[","").replace("]","").replace(", ",""));

        for(int i = 0; i < rightstack.size(); i++){
            sb.append(rightstack.get(rightstack.size() - i - 1));
        }

        System.out.println(sb);

    }

    static private char pop (ArrayList<Character> stack){

        char top = stack.get(stack.size()-1);
        stack.remove(stack.size() - 1);

        return top;
    }

    static private void push(ArrayList<Character> stack, char c){
        stack.add(c);
    }

}
