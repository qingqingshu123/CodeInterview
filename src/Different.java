/**
 * Created by jixiaoqiang on 2017/4/18.
 */
public class Different {
    public static void main(String[] args) {
       if(checkDifferent(args[0]))
           System.out.println("TRUE");
        else
           System.out.println("FALSE");
    }
    public static boolean checkDifferent(String iniString) {
        // write code here
        final int BITS = 32;
        int[] bits = new int[256/BITS];
        if(iniString.length() > 255)
            return false;
        for(int i =0; i<iniString.length();i++){
            //unicode ±àÂë£¿
            int pos = iniString.charAt(i);
            System.out.println(pos);
//            if((bits[pos/BITS]&(1<<(pos%BITS))) > 0)
//                return  false;
//            bits[pos/BITS]|= (1<<(pos%BITS));
        }
        return true;
    }
}
