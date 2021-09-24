import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }


        int[][] temp = new int[N][2];

        mergeSort(array, temp, 0, N-1);

        for(int i = 0; i < N; i++){
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }

        System.out.println(sb);

    }

    private static void mergeSort(int[][] array, int[][] temp, int start, int end){

        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(array, temp, start, mid);
            mergeSort(array, temp, mid+1, end);
            merge(array, temp, start, mid, end);
        }

    }

    private static void merge(int[][] array, int[][] temp, int start, int mid, int end){

        for(int i = start; i < end+1; i++){
            temp[i][0] = array[i][0];
            temp[i][1] = array[i][1];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 <= mid && part2 <= end){

            if(temp[part1][1] < temp[part2][1]){
                array[index][0] = temp[part1][0];
                array[index][1] = temp[part1][1];
                part1++;
            }else if(temp[part1][1] > temp[part2][1]){
                array[index][0] = temp[part2][0];
                array[index][1] = temp[part2][1];
                part2++;
            }else{
                if(temp[part1][0] < temp[part2][0]){
                    array[index][0] = temp[part1][0];
                    array[index][1] = temp[part1][1];
                    part1++;
                }else{
                    array[index][0] = temp[part2][0];
                    array[index][1] = temp[part2][1];
                    part2++;
                }
            }
            index++;

        }

        for(int i = 0; i < mid - part1+1; i++){
            array[index+i][0] = temp[part1+i][0];
            array[index+i][1] = temp[part1+i][1];
        }


    }



}

