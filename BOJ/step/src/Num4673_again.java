public class Num4673_again {

    public static int selfNum(int i){


        int sum = i;
        while (true){
            sum += i%10;
            i /= 10;
            if(i == 0) {
                break;
            }
        }


        return sum;

    }

    public static void main(String[] args) {
        boolean[] selfNum = new boolean[10001];

        int sum = 0;

       for(int i = 1; i < 10001; i++){

           sum = selfNum(i);
           if(sum < 10001) selfNum[sum] = true;

       }
        for(int i = 1; i < 10001; i++){
           if(!selfNum[i]) System.out.println(i);
        }
    }

}
