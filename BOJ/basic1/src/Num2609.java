import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] aArray = new int[A+1];
        int[] bArray = new int[B+1];

        int num = 2;
        while (A > 1){

            if(A % num == 0){
                A /= num;
                aArray[num]++;
            }else{
                num++;
            }

        }

        num = 2;
        while (B > 1){

            if(B % num == 0){
                B /= num;
                bArray[num]++;
            }else{
                num++;
            }

        }

        int factor = 1;
        for(int i = 0; i < Math.min(aArray.length, bArray.length); i++){
            int min = Math.min(aArray[i], bArray[i]);
            if(min != 0) {
                factor *= Math.pow(i, min);
            }
        }

        int multiple = 1;
        int max;
        for(int i = 0; i < Math.max(aArray.length, bArray.length); i++){
            if(i > aArray.length-1){
                max = bArray[i];
            }else if (i > bArray.length-1){
                max = aArray[i];
            }else {
                max = Math.max(aArray[i], bArray[i]);
            }
            if(max != 0) {
                multiple *= Math.pow(i, max);
            }
        }

        sb.append(factor).append("\n");
        sb.append(multiple);

        System.out.println(sb);

    }

}
