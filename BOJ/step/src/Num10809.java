import java.util.Scanner;

public class Num10809 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] arp = new int[26];
        for(int i = 0; i < arp.length; i++){
            arp[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(arp[c - 'a'] == -1) arp[c - 'a'] = i;
        }

        for(int i = 0; i < arp.length; i++){
            System.out.printf("%d ", arp[i]);
        }
    }


}
