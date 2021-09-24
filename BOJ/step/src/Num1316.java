import java.util.Scanner;

public class Num1316 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            String s = scanner.next();
            if(check(s)){
                count++;
            }
        }

        System.out.println(count);


    }

    static boolean check(String s){

        boolean[] check = new boolean[26];
        boolean result = true;
        int prev = 0;

        for(int i = 0; i < s.length(); i++){
            int now = s.charAt(i);

            if(prev != now){
                if(check[now - 'a']){
                    result = false;
                    break;
                }else{
                    check[now - 'a'] = true;
                    prev = now;
                }
            }else{
                continue;
            }
        }

        return result;
    }


}
