import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        boolean[] array = new boolean[1000001];
        int count = 0;
        for(int i = 2; i < 1000001; i++){
            for(int j = i + i; j < 1000001; j+=i){
                array[j] = true;
            }
        }
        array[0] = array[1] = true;

        while (count < 100000){

            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int a = 0; int b = 0;
            for(int i = 0; i <= n/2; i++){
                if(!array[i] && !array[n-i]){
                    a = i; b = n-i;
                    break;
                }
            }

            if(a == 0){
                sb.append("Goldbach's conjecture is wrong.");
            }else{
                sb.append(n).append(" = ").append(a).append(" + ").append(b).append("\n");
            }

            count++;

        }

        System.out.println(sb);

    }

}
