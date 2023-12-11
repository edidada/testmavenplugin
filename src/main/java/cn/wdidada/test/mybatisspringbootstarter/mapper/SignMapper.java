package cn.wdidada.test.mybatisspringbootstarter.mapper;

import cn.wdidada.test.mybatisspringbootstarter.entity.Sign;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SignMapper {
    int insertOne(Sign sign);

    int isSign7InWeek(String date);

    int isSign7InWeekWithId(@Param("date") String date,@Param("userId") String userId);
}
