package cn.wdidada.test.mybatisspringbootstarter.test.dao;

import cn.wdidada.test.mybatisspringbootstarter.entity.User;
import cn.wdidada.test.mybatisspringbootstarter.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void mapperTest(){
        assert userMapper != null;
    }

    @Test
    public void selectByIdMap(){

        Map<String, Object> params = new HashMap<String, Object>(2);
        String name = "as";
        params.put("name", name);
        List<String> names = new LinkedList<>();
        names.add("测试1");
        names.add("测试2");
        params.put("idList", names);
        userMapper.selectByIdMap(params);
    }

    @Test
    public void queryListTests(){
        User user = new User();
        user.setPassWord("asa");
        user.setId(12321);
        user.setRealName("sds");
        user.setUserName("sdsf12222222");
        userMapper.insertOne(user);
    }

    @Test
    public void queryListTest(){
        List<String> names = new LinkedList<>();
        names.add("测试1");
        names.add("测试2");
        names.add("测试3");
        names.add("测试4");
        List<User> list = userMapper.getUserByNames(names);
        list.forEach(u -> {
            System.out.println(u.getRealName());
        });
    }

}
