import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num18870 {

    public static boolean[][] array;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] temp = array.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for(int i = 0; i < N; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], count);
                count++;
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(map.get(array[i])).append(" ");
        }



        System.out.println(sb);


    }



}

