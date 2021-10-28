import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num17087 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st2.nextToken());
            if(array[i] < S){
                array[i] = S - array[i];
            }else{
                array[i] = array[i] - S;
            }
        }

        int answer = 1;
        if(N == 1){
            answer = array[0];
        }
        for(int i = 0; i < N-1; i++){
            if(i == 0){
                answer = Euclidean(array[i], array[i+1]);
            }else{
                answer = Euclidean(answer, array[i+1]);
            }
        }



        System.out.println(answer);

    }

    static public int Euclidean(int a, int b){

        if(b == 0) return a;
        return Euclidean(b, a%b);

    }

}
