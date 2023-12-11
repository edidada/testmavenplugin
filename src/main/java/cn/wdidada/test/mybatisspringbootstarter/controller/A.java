package cn.wdidada.test.mybatisspringbootstarter.controller;

import cn.wdidada.test.mybatisspringbootstarter.entity.User;
import cn.wdidada.test.mybatisspringbootstarter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {

    @Qualifier
    private UserMapper userMapper;

    @Autowired
    private UserMapper userMapper2;

    @GetMapping("a.html")
    public @ResponseBody String getA(){
        User user = new User();
        user.setId(2321);
        user.setUserName("23");
        user.setRealName("zhangsan");
        user.setPassWord("sdfs");
        int i = userMapper2.insertOne(user);
//        int i2 = userMapper.insertOne(user);
        return i==1?"a":"b";
    }

    @GetMapping("b.html")
    public @ResponseBody String getB(){
        User user = new User();
        user.setId(2321);
        user.setUserName("23");
        user.setRealName("zhangsan");
        user.setPassWord("sdfs");
        int i = userMapper2.insertOneTest(user);
//        int i2 = userMapper.insertOne(user);
        return i+"";
    }
}
