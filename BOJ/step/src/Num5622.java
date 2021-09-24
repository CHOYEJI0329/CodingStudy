import java.util.Scanner;

public class Num5622 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seco = 0;

        /*String[] s = {"1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "0"};

        String input = scanner.next();

        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < s.length; j++){
                for(int e = 0; e < s[j].length(); e++){
                    if(input.charAt(i) == s[j].charAt(e)){
                        seco+=(j+2);
                    }
                }
            }
        }*/

        String input = scanner.next();
        for(int i = 0; i < input.length(); i++){

            switch (input.charAt(i)){

                case '1':
                    seco += 2;
                    break;
                case 'A': case 'B': case 'C':
                    seco += 3;
                    break;
                case 'D': case 'E': case 'F':
                    seco += 4;
                    break;
                case 'G': case 'H': case 'I':
                    seco += 5;
                    break;
                case 'J': case 'K': case 'L':
                    seco += 6;
                    break;
                case 'M': case 'N': case 'O':
                    seco += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    seco += 8;
                    break;
                case 'T': case 'U': case 'V':
                    seco += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    seco += 10;
                    break;
                case '0':
                    seco += 11;
                    break;
            }



        }

        System.out.println(seco);

    }


}
