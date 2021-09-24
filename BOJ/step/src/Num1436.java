import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 666;
        int count; int NumCount = 0;
        int[] array = new int[10000];


        while (true){
            count = 0;
           for(int j = i; j > 0; j /= 10){

               array[count] = j % 10;
               count++;
           }

           for(int j = 0; j < count - 2; j++){

               if(array[j] == array[j+1] && array[j+1] == array[j+2] && array[j+2] == 6){
                   NumCount++;
                   break;
               }

           }

           if(N == NumCount) {
               System.out.println(i);
               break;
           }

           i++;


        }




    }




}

