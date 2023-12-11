package cn.wdidada.test.mybatisspringbootstarter.test.dao;

import cn.wdidada.test.mybatisspringbootstarter.entity.Sign;
import cn.wdidada.test.mybatisspringbootstarter.mapper.SignMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignMapperTest {

    @Autowired
    private SignMapper signMapper;

    @Test
    public void mapperTest() throws ParseException {
        assert signMapper != null;

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=sdf.parse("2021-01-04");
        Date sssdate = new Date();
        String s = sdf.format(sssdate);
        Sign sign = new Sign();
        sign.setDate(s);
        sign.setUserId("1231231");
        sign.setWeekday(daysBetween(d1,sssdate)/7 +"");
        if(signMapper.isSign7InWeekWithId(sign.getWeekday(), sign.getUserId())==0){
            int sssId = signMapper.insertOne(sign);
            if(sssId>0) {
                System.out.println("uuuuid：" + sign.getId());
            }
        }else {
            System.out.println("uuuuid not found");
        }

        int dayCount = signMapper.isSign7InWeek("49");
        System.out.println(dayCount > 7);
    }

    public static int daysBetween(Date smdate,Date bdate) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }
}
