import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num10866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> Deque = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){

                case "push_front":
                    int num_front = Integer.parseInt(st.nextToken());
                    Deque.add(0, num_front);
                    break;
                case "push_back":
                    int num_back = Integer.parseInt(st.nextToken());
                    Deque.add(num_back);
                    break;
                case "pop_front":
                    int pop_front = -1;
                    if(Deque.size() != 0){
                        pop_front = Deque.get(0);
                        Deque.remove(0);
                    }
                    sb.append(pop_front).append("\n");
                    break;
                case "pop_back":
                    int pop_back = -1;
                    if(Deque.size() != 0){
                        pop_back = Deque.get(Deque.size()-1);
                        Deque.remove(Deque.size()-1);
                    }
                    sb.append(pop_back).append("\n");
                    break;
                case "size":
                    int size = Deque.size();
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    int empty = Deque.size() == 0 ? 1 : 0;
                    sb.append(empty).append("\n");
                    break;
                case "front":
                    int front = -1;
                    if(Deque.size() != 0){
                        front = Deque.get(0);
                    }
                    sb.append(front).append("\n");
                    break;
                case "back":
                    int back = -1;
                    if(Deque.size() != 0){
                        back = Deque.get(Deque.size()-1);
                    }
                    sb.append(back).append("\n");
                    break;

            }

        }

        System.out.println(sb);

    }

}
