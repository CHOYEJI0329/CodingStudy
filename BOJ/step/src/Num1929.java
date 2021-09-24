import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

//        에라토스테네스의 체의 방법으로 소수 판단.
        boolean[] array = new boolean[N+1];

        for(int i = M; i < N+1; i++){
            array[i] = true;
        }

        array[0] = array[1] = false;

        for(int i = 2; i*i < N+1; i++){
            for(int j = i*i; j < N+1; j+=i ){
                array[j] = false;
            }
        }

        for(int i = M; i < N+1; i++){
            if(array[i] == true){
                System.out.println(i);
            }
        }



    }

}
