import java.util.Scanner;

/**
 * Created by qqs on 2017/4/14.
 * 思路：模拟过程
 */
public class Gushen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //int i = 1;
            int val = 1;
            int up = 0;
            int upto = 1;
            while (n-- > 1) {
                up++;
                val++;
                if (up > upto) {
                    val -= 2;
                    up = 0;
                    upto++;
                }

            }
            System.out.println(val);
        }
    }
}
