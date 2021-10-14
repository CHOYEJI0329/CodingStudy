import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num11656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String[] array = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            array[i] = s.substring(i);
        }

        Arrays.sort(array);

        for(int i = 0; i < s.length(); i++){
            sb.append(array[i]).append("\n");
        }

        System.out.println(sb);

    }

}
