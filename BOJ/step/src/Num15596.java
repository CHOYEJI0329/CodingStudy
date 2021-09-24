public class Num15596 {

    static long sum(int[] a){

        int sum = 0;

        for(int i = 0; i < a.length; i++){
            sum+=a[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] a = {5, 10, 15};
        long sum = sum(a);
        System.out.println(sum);
    }

}
