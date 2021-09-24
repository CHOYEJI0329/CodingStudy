import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num11651__buil_in_function {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (arr1, arr2) ->{
            if(arr1[1] == arr2[1]){
                return Integer.compare(arr1[0], arr2[0]);
            }else{
                return Integer.compare(arr1[1], arr2[1]);
            }

        });

        for(int i = 0; i < N; i++){
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }

        System.out.println(sb);

    }





}

