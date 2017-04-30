import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jixiaoqiang on 2017/4/14.
 * 要求小数点精度的情况下  尽力使用double
 */
public class MinLampDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lampNum = 0;
        long dis = 0;
        lampNum = sc.nextInt();
        dis = sc.nextLong();
        long[] pos = new long[lampNum];
        for (int i = 0; i < lampNum; i++) {
            pos[i] = sc.nextLong();
        }
        //数组如何逆序
        Arrays.sort(pos);
        double minD = Double.MIN_VALUE;
        for (int i = 0; i < lampNum - 1; i++) {
            if (pos[i + 1] == pos[i])
                continue;
            else {
                long dist = pos[i + 1] - pos[i];
                minD = Math.max( minD, ((double)dist)/2);
            }
        }
        minD = Math.max(minD, (double) pos[0]);
        minD = Math.max(minD, (double) (dis - pos[lampNum - 1]));
        System.out.printf("%.2f", minD);
    }
}

