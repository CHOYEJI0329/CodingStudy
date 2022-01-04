import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1107_fail {

    static boolean[] che;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());
        che = new boolean[11];

        for(int i = 0; i < 11; i++){
            che[i] = true;
        }

        int f = Integer.parseInt(br.readLine());
        if(f > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < f; i++) {
                che[Integer.parseInt(st.nextToken())] = false;
            }
        }

        long num = (long) Math.pow(10, Math.floor(Math.log10(N)));

        int count = 0;
        long[] array = new long[2];
        long sum = 0;
        long copy = N;
        boolean r = false;
        while (num > 0){
            long i = copy / num;
            if(i == 0 && r) i = 10;
            array = near(i);
            sum += array[0] * num;
            count++;
            copy %= num;
            num /= 10;
            if(count == 1) {
                if((N / (num * Math.pow(10, count))) > array[0]) r = true;
            }
        }

        count += Math.min(Math.abs(N - sum), Math.abs(sum - N));
        count = (int) Math.min(count, Math.abs(N - 100));
        System.out.println(count);



    }

    public static long[] near (long num){
        long[] array = new long[2];
        array[0] = array[1] = 11;

        long min = 10;
        for(int i = 0; i < 10; i++){
            if(che[i]){
                long j = Math.abs(num - i);
                min = Math.min(min, j);
            }
        }

        if(che[(int) Math.abs (num - min)]){
            array[0] = Math.abs(num - min);
        }
        if(num < 10) {
            if (che[(int) Math.abs(num + min)]) {
                if (array[0] != 11) {
                    array[1] = num + min;
                } else {
                    array[0] = num + min;
                }
            }
        }

        return array;
    }


}
