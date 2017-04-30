/**
 * Created by jixiaoqiang on 2017/4/18.
 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString(args[0]));
    }
    public static String reverseString(String iniString) {
        // write code here
        StringBuilder sb = new StringBuilder(iniString);
        for (int i = iniString.length()-1, j =0; i >j ; j++,i--) {
            char a = sb.charAt(j);
            sb.setCharAt(j,sb.charAt(i));
            sb.setCharAt(i,a);
        }
       // sb.reverse();
        return sb.toString();
        iniString.
    }
}
