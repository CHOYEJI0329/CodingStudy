import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2447_again {

    static char[][] array;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        array = new char[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                array[i][j] = ' ';
            }
        }

        star(0, 0, N);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
               sb.append(array[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

    public static void star(int x, int y, int N){

        if(N == 1) {
            array[x][y] = '*';
            return;
        }

        N/=3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1) continue;

                star(x + i*N, y+j*N, N);
            }
        }


    }



}

