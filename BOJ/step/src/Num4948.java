import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count;

        while (true){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            count = decimal(n+1, (2*n)+1);
            System.out.println(count);

        }

    }

    public static int decimal(int M, int N){

        int count = 0;

        boolean[] array = new boolean[N];
        array[0] = array[1] = false;

        for(int i = 2; i < N; i++){
            array[i] = true;
        }

        for(int i = 2; (i*i) < N; i++){
            for(int j = i*i; j < N; j+=i){
                array[j] = false;
            }
        }

        for(int i = M; i < N; i++){
            if(array[i] == true) count++;
        }

        return count;
    }



}


