import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3085_again {

    static char[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        array = new char[N][N];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                array[i][j] = s.charAt(j);
            }
        }

        int max = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){

                if(j != N-1 && array[i][j] != array[i][j+1]){
                    char temp = array[i][j]; array[i][j] = array[i][j+1]; array[i][j+1] = temp;
                    int check = check();
                    max = Math.max(max, check);
                    temp = array[i][j]; array[i][j] = array[i][j+1]; array[i][j+1] = temp;
                }

                if(j != N-1 && array[j][i] != array[j+1][i]){
                    char temp = array[j][i]; array[j][i] = array[j+1][i]; array[j+1][i] = temp;
                    int check = check();
                    max = Math.max(max, check);
                    temp = array[j][i]; array[j][i] = array[j+1][i]; array[j+1][i] = temp;
                }

            }
        }


        System.out.println(max);
    }

    static Integer check(){

        int max = 1;
        int sum_1 = 1;
        int sum_2 = 1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if (j < array.length-1 && array[i][j] == array[i][j+1]){
                    sum_1++;
                }else{
                    max = Math.max(max, sum_1);
                    sum_1 = 1;
                }

                if (j < array.length-1 && array[j][i] == array[j+1][i]){
                    sum_2++;
                }else{
                    max = Math.max(max, sum_2);
                    sum_2 = 1;
                }
            }
        }


        return max;

    }


}
