import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int x1, y1, r1, x2, y2, r2, dis, sub, bigger, smaller;
        double distance;

        for(int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            dis = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            distance = Math.sqrt(dis);

            sub = r1 > r2 ? r1 - r2 : r2 - r1;
            bigger = r1 > r2 ? r1 : r2;
            smaller = r1 < r2 ? r1 : r2;

//          동일위치, 동일반지름(일치 하는 원)
            if (distance == 0 && sub == 0) System.out.println("-1");
//          동일위치, 다른반지름(원안에 원)
            else if (distance == 0 && sub != 0) System.out.println(0);
//          내접
            else if (distance == sub) System.out.println(1);
            else if (distance < bigger && distance + smaller < bigger) System.out.println(0);
            else if (distance == bigger) System.out.println(2);
//          두 티렛 사이의 거리 < 두 반지름의 합  --> 두 점 겹침
            else if (distance < r1+r2) System.out.println(2);
//          두 티렛 사이의 거리 < 두 반지름의 합 --> 겹치지 않음
            else if (distance > r1+r2) System.out.println(0);
//          외접
            else if (distance == r1+r2) System.out.println(1);


        }



    }




}

