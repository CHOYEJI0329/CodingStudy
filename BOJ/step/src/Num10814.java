import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] array = new String[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        Arrays.sort(array, (a1, a2) -> {
            if(a1[0].equals(a2[0])) return 0;
            else{
                return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
            }
        });

        for(int i = 0; i < N; i++){
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }

        System.out.println(sb);



    }




}

