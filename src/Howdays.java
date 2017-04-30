import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by jixiaoqiang on 2017/4/17.
 */
public class Howdays {
    public static void main(String[] args)throws Exception{
       /* Scanner sc = new Scanner(System.in);
        String  date = sc.nextLine();
        String[] date1 =date.split("-");
        int year1 = Integer.parseInt(date1[0]);
        int month1 = Integer.parseInt(date1[1]);
        int day1 = Integer.parseInt(date1[2]);
        System.out.println(year1);
        System.out.println(month1);
        System.out.println(day1);
        Date now = new Date();

        Date future = new Date();
        long dis = future.getTime() - now.getTime();
        System.out.println(future.getTime());
        System.out.println(now.getTime());
        System.out.println(dis);
        System.out.println(dis/(24*3600*1000));*/

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date date = df.parse(sc.nextLine());
        Date now =df.parse("2015-10-18");
        long l=date.getTime()-now.getTime();
        long day=l/(24*60*60*1000);

        System.out.println(day);
    }

}
