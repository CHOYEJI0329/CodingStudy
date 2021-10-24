import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.StringTokenizer;

public class Num2004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long answer = Math.min(twoNum(n) - (twoNum(m) + twoNum(n-m)), fiveNum(n) - (fiveNum(m) + fiveNum(n-m)));

        System.out.println(answer);

    }

   static long twoNum(long num){
        long count = 0;

            while (num >= 2) {
                count += num / 2;
                num /= 2;
            }

        return count;
   }

    static long fiveNum(long num){
        long count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }
        return count;
    }
}
