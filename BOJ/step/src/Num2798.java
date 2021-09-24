import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] array = br.readLine().split(" ");

        int answer = 0;
        int pt = 0;

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                if(i == j) continue;
                for(int e = i+1; e < N; e++){
                    if(e == i || e == j) continue;
                    pt = Integer.parseInt(array[i]) + Integer.parseInt(array[j]) + Integer.parseInt(array[e]);
                    if(pt > M){
                        pt = 0;
                        continue;
                    }
                    if(answer < pt){
                        answer = pt;
                    }
                    pt=0;
                }
            }
        }

        System.out.println(answer);

    }


}

