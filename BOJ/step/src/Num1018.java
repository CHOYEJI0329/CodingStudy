import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1018 {

    public static boolean[][] array;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String s;

        array = new boolean[N][M];

        for(int i = 0; i < N; i++){
            s = br.readLine();

            for(int j = 0; j < M; j++){
                if(s.charAt(j) == 'W'){
                    array[i][j] = true;
                }else{
                    array[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_row = M - 7;

        for(int i = 0; i < N_row; i++){
            for(int j = 0; j < M_row; j++){
                find(i,j);
            }
        }

        System.out.println(min);

    }

    public static void find(int x, int y){

        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = array[x][y];

        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){

                if(array[i][j] != TF){
                    count++;
                }

                TF = !TF;

            }

            TF = !TF;
        }

        count = Math.min(count, 64-count);

        min = Math.min(count, min);
    }








}

