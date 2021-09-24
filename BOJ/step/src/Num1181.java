import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[][] s = new String[N][2];

        for(int i = 0; i < N; i++){
            s[i][0] = br.readLine();
            s[i][1] = String.valueOf(s[i][0].length());
        }

        Arrays.sort(s, (s1, s2) -> {
            if(s1[1].equals(s2[1])){
               return s1[0].compareTo(s2[0]);
            }else{
                return Integer.compare(Integer.parseInt(s1[1]), Integer.parseInt(s2[1]));
            }
        });


        for(int i = 0; i < N; i++){
            if(i == 0 || !s[i-1][0].equals(s[i][0])){
                sb.append(s[i][0]).append("\n");
            }
        }

        System.out.println(sb);
    }






}

