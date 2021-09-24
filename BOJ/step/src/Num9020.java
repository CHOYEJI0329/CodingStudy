import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num9020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            int n = Integer.parseInt(br.readLine());

            decimal(n);

            System.out.println();

        }

    }

    public static void decimal(int n){

        int count = 0;
        boolean[] array = new boolean[n+1];
        array[0] = array[1] = false;

        for(int i = 2; i < n+1; i++){
            array[i] = true;
        }


        for(int i = 2; i*i < n+1; i++){
            for(int j = i*i; j < n+1; j+=i){
                array[j] = false;
            }
        }

        int p = n/2;
        int q = n/2;

        while (true){
            if(array[p] && array[q]){
                System.out.printf("%d %d", p, q);
                break;
            }
            p--; q++;
        }

    }



}

