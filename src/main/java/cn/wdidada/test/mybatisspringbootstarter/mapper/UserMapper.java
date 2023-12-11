package cn.wdidada.test.mybatisspringbootstarter.mapper;

import cn.wdidada.test.mybatisspringbootstarter.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Repository
public interface UserMapper {

    User getUser(int id);

    List<User> getUserByName(String name);

    List<User> getUserByNames(List<String> names);

    User getOneUserByName(String name);

    int insertOne(User user);

    int insertOneTest(User user);

    List<User> selectByIdSet(@Param("name")String name, @Param("ids")String[] idList);

    List<User> selectByIdMap(Map<String, Object> params);
}
