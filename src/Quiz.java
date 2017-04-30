import java.util.Scanner;

/**
 * Created by jixiaoqiang on 2017/4/17.
 */
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //0fail  1 Zifei 2Gongfei
        //int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            if (m1 < 60 || m2 < 60 || m3 < 90 || m4 < 90) {
                System.out.println("Fail");
                continue;
            } else {
                int sum = m1 + m2 + m3 + m4;
                if (sum < 350)
                    System.out.println("Zifei");
                else
                    System.out.println("Gongfei");
            }
        }
    }
}
