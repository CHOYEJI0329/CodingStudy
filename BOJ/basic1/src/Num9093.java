import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num9093 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String[] array = br.readLine().split(" ");
            word(array);
        }

        System.out.println(sb);

    }

    private static void word(String[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = array[i].length()-1; j >= 0; j--){
                sb.append(array[i].charAt(j));
            }
            sb.append(" ");
        }
        sb.append("\n");

    }

}
