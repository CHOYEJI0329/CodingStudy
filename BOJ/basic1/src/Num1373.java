import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1373 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder answer = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i-=3){

            int num = 1;
            int sum = 0;
            for(int j = i; j > i-3 && j > -1; j--){

                if(s.charAt(j) == '1'){
                    sum+=num;
                }
                num *= 2;
            }

            answer.append(sum);
        }

        System.out.println(answer.reverse());

    }

}
