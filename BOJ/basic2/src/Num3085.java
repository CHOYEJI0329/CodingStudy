import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] array = new char[N][N];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                array[i][j] = s.charAt(j);
            }
        }

        int max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){

                if(j+1 < N){            // 오른쪽
                    char t = array[i][j]; array[i][j] = array[i][j+1]; array[i][j+1] = t;   // swap
                    int check = check(array);
                    max = Math.max(max, check);
                    t = array[i][j]; array[i][j] = array[i][j+1]; array[i][j+1] = t;
                }

                if(i+1 < N){            // 아래쪽
                    char t = array[i][j]; array[i][j] = array[i+1][j]; array[i+1][j] = t;   // swap
                    int check = check(array);
                    max = Math.max(max, check);
                    t = array[i][j]; array[i][j] = array[i+1][j]; array[i+1][j] = t;
                }

            }
        }

        System.out.println(max);

    }

    static public int check(char[][] array){

        int N = array.length;
        int check = 0;
        for(int i = 0; i < N; i++){
            int ans = 1;
            for(int j = 1; j < N; j++){
                if(array[i][j] == array[i][j-1]){
                    ans++;
                }else{
                    ans = 1;
                }
                check = Math.max(check, ans);
            }
            ans = 1;
            for(int j = 1; j < N; j++){
                if(array[j][i] == array[j-1][i]){
                    ans++;
                }else{
                    ans = 1;
                }
                check = Math.max(check, ans);
            }
        }

        return check;
    }

}
