import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1212 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            long num = s.charAt(i) - '0';
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < 3; ++j) {
                temp.append(num % 2);
                num /= 2;
                if (i == 0 && num == 0) break;
            }
            temp.reverse();
            answer.append(temp);
        }

        System.out.println(answer);

    }

}
