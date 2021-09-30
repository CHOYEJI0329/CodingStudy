import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num10845 {


    static ArrayList<Integer> queue;
    static int start = 0;
    static int end = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        queue = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){

                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    int pop = pop();
                    sb.append(pop).append("\n");
                    break;
                case "size":
                    int size = size();
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    int empty = empty();
                    sb.append(empty).append("\n");
                    break;
                case "front":
                    int front = front();
                    sb.append(front).append("\n");
                    break;
                case "back":
                    int back = back();
                    sb.append(back).append("\n");
                    break;

            }

        }

        System.out.println(sb);

    }

    private static void push(int num){
        queue.add(num);
    }

    private static int pop(){
        int pop = -1;
        if(queue.size() != 0){
            pop = queue.get(0);
            queue.remove(0);
        }
        return pop;
    }

    private static int size(){
        int size = queue.size();
        return size;
    }

    private static int empty(){
        int empty = queue.isEmpty() == true ? 1 : 0;
        return empty;
    }

    private static int front(){
        int front = -1;
        if(!queue.isEmpty()){
            front = queue.get(0);
        }
        return front;
    }

    private static int back(){
        int back = -1;
        if(!queue.isEmpty()){
            back = queue.get(queue.size()-1);
        }
        return back;
    }

}
