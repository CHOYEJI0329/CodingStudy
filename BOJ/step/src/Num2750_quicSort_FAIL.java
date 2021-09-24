import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2750_quicSort_FAIL {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

       quicSort(array, 0, array.length-1);

        for(int i = 0; i < N; i++){
            sb.append(array[i]).append("\n");
        }

        System.out.println(sb);


    }

    public static void quicSort(int[] array, int start, int end){

        int part = partition(array, start, end);

        if(start < part-1){
            quicSort(array, start, part-1);
        }

        if(part < end){
            quicSort(array, part, end);
        }

    }

    public static int partition(int[] array, int start, int end){

        int pivot = array[(start + end) / 2];
        while (start <= end){
            while (array[start] < pivot) start++;
            while (pivot < array[end]) end--;

            if(start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }


        }

        return start;
    }





}

