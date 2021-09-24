import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2108_courtSort_is_point {

    public static StringBuilder sb = new StringBuilder();
    public static int[] array;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

//        정렬
        int[] temp = new int[N];
        mergeSort(array, temp, 0, N-1);

//        평균값
        double Num = 0;
        for(int i = 0; i < (N+1) / 2; i++){
            Num+=array[i];
            if(i != (N-1) / 2){
                Num+=array[N-i-1];
            }
        }

        long ave = Math.round(Num / N);
        sb.append(ave).append("\n");


//        중앙값
        sb.append(array[(N-1) / 2]).append("\n");

//      최빈값
        int[] count = new int[8001];
        for(int i = 0; i < N; i++){
            count[array[i]+4000]++;
        }
        /*for(int i = 0; i < array.length; i++){
            for(int j = i; array[i] == array[j]; j++){
                count[i]++;
                if(j == array.length-1) break;
            }

        }*/

        int max = 0;
        for(int i = 0; i < count.length; i++){
            max = Math.max(max, count[i]);
        }

        int count1 = 0;
        int mode = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == max){
                count1++;
                if(count1 == 2){
                    mode = i;
                    break;
                }else if(count1 == 1) {
                    mode = i;
                }
            }
        }


        sb.append(mode-4000).append("\n");

//      범위
        sb.append(array[N-1] - array[0]).append("\n");


        System.out.println(sb);


    }

    private static void mergeSort(int[] array, int[] temp, int start, int end){

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, temp, start, mid);
            mergeSort(array, temp, mid + 1, end);
            merge(array, temp, start, mid, end);
        }
    }

    private static void merge(int[] array, int[] temp, int start, int mid, int end){

        for(int i = start; i < end+1; i++){
            temp[i] = array[i];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 < mid+1 && part2 < end+1){

            if(temp[part1] < temp[part2]){
                array[index] = temp[part1];
                part1++;
            }else{
                array[index] = temp[part2];
                part2++;
            }

            index++;

        }

        for(int i = 0; i < mid - part1+1; i++){
            array[index+i] = temp[part1+i];
        }


    }




}

