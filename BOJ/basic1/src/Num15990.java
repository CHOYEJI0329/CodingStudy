import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num15990 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        long[][] d = new long[100001][4];

        /*
            d[i][j] ==> i를 만드는 수식중 마지막에 j로 끝나는 수
            ex) d[1][1] ==> 1을 만드는 수식중 마지막에 1로 끝나는수 => 공집합 + 1 => 1가지
                d[1][2] ==> 1을 만드는 수식중 마지막에 2로 끝나는수 => 없음 => 0가지
                d[3][1] ==> 3을 만드는 수식중 마지막에 1로 끝나는수 => 2+1 -> 1가지
                등등... 예외 처리를 먼저 해주고 반복문을 돌려줌.
         */
        d[1][1] = d[2][2] = d[3][1] = d[3][2] = d[3][3] = 1;
        for(int i = 4; i < d.length; i++){
            d[i][1] = (d[i-1][2] + d[i-1][3]) % 1000000009L;
            d[i][2] = (d[i-2][1] + d[i-2][3]) % 1000000009L;
            d[i][3] = (d[i-3][1] + d[i-3][2]) % 1000000009L;
        }

        for(int i = 0; i < T; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append((d[num][1] + d[num][2] + d[num][3]) % 1000000009L).append("\n");
        }

        System.out.println(sb);

    }

}
