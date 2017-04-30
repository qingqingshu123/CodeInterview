import java.util.Scanner;

/**
 * Created by jixiaoqiang on 2017/4/17.
 */
public class MaxPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        int curNum = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            curNum += b - a;
            maxNum = Math.max(maxNum, curNum);
        }
        System.out.println(maxNum);
    }
}
