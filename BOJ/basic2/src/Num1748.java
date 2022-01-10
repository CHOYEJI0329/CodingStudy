import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int count = 10;
        int length = 1;
        for(int i = 1; i < N+1; i++){

            /*if(i < 10) length = 1;
            else if(i < 100) length = 2;
            else if(i < 1000) length = 3;
            else if(i < 10000) length = 4;
            else if(i < 100000) length = 5;
            else if(i < 1000000) length = 6;
            else if(i < 10000000) length = 7;
            else if(i < 100000000) length = 8;
            else if(i == 100000000) length = 9;*/
            if(i == count){
                length++;
                count *= 10;
            }

            answer+=length;
        }
        System.out.println(answer);
    }

}
