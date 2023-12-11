package cn.wdidada.test.mybatisspringbootstarter.test.unit;


import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test3 {

    /**
     * @param args
     * @throws ParseException
     * format() 对日期进行格式化处理
     * parse() 将日期设置为date类型
     */
    @Test
    public void testdd() throws ParseException {
        // TODO Auto-generated method stub
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse("2016-09-08 10:10:10");
        Date d2=sdf.parse("2016-09-26 22:00:00");
        Date d3=sdf.parse(sdf.format(new Date()));//获得当前时间
        System.out.println(daysBetween(d1,d2));
        System.out.println(daysBetween(d2, d3));
        System.out.println(daysBetween("2016-09-08 10:10:10","2016-09-29 00:00:00"));
        System.out.println(daysBetween("2016-09-08 10:10:10", d3));
    }

    @Test
    public void testddss() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=sdf.parse("2021-01-04");

        for(int i =0;i<365;i++) {
            Date date = new Date(); //取时间
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(d1);
            calendar.add(calendar.DATE, i); //把日期往后增加一天,整数  往后推,负数往前移动
            date = calendar.getTime(); //这个时间就是日期往后推一天的结果
            String dd =sdf.format(date);
            System.out.println(dd);
            System.out.println(daysBetween(d1,date)/7);
        }

        Date d2=sdf.parse("2021-12-05");
        Date d3=sdf.parse(sdf.format(new Date()));//获得当前时间
        System.out.println(daysBetween(d1,d2));
        System.out.println(daysBetween(d2, d3));
    }

    /**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * @throws ParseException
     * calendar 对日期进行时间操作
     * getTimeInMillis() 获取日期的毫秒显示形式
     */
    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }
    /**
     * 字符串日期格式的计算
     * @param smdate
     * @param bdate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(String smdate,String bdate) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }
    /**
     * 字符串日期格式和date日期格式的计算
     * @param smdate
     * @param bdate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(String smdate,Date bdate) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }

}

