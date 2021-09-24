import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 병합정렬
public class Num2750_mergeSort_SUCESS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int temp[] = new int[array.length];
        mergeSort(array, temp, 0, array.length-1);

        for(int i = 0; i < array.length; i++){
            sb.append(array[i]).append("\n");
        }

        System.out.println(sb);



    }

    private static void mergeSort(int[] array, int[] temp, int start, int end){

        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(array, temp, start, mid);
            mergeSort(array, temp, mid+1, end);
            merge(array, temp, start, mid, end);
        }

    }

    private static void merge(int[] array, int[] temp, int start, int mid, int end){

        for(int i = start; i < end+1; i++){
            temp[i] = array[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while(part1 <= mid && part2 <= end){
            if(temp[part1] < temp[part2]){
                array[index] = temp[part1];
                part1++;
            }else{
                array[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0; i <= mid - part1; i++){
            array[index+i] = temp[part1 + i];
        }


    }

}

