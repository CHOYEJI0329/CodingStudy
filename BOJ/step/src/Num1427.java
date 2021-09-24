import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        int[] num = new int[N.length()];

        for(int i = 0; i < N.length(); i++){
            num[i] = N.charAt(i) - '0';
        }

        int temp[] = new int[N.length()];
        mergeSort(num, temp, 0, num.length-1);

        for(int i = 0; i < num.length; i++){
            sb.append(num[i]);
        }

        System.out.println(sb);
    }

    private static void mergeSort(int[] num, int[] temp, int start, int end){

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(num, temp, start, mid);
            mergeSort(num, temp, mid + 1, end);
            merge(num, temp, start, mid, end);
        }
    }

    private static void merge(int[] num, int[] temp, int start, int mid, int end){

        for(int i = start; i < end+1; i++){
            temp[i] = num[i];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while (part1 < mid+1 && part2 < end+1){

            if(temp[part1] > temp[part2]){
                num[index] = temp[part1];
                part1++;
            }else{
                num[index] = temp[part2];
                part2++;
            }

            index++;

        }

        for(int i = 0; i < mid-part1+1; i++){
            num[index+i] = temp[part1 + i];
        }


    }


}

