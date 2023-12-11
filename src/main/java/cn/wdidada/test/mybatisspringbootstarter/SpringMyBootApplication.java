package cn.wdidada.test.mybatisspringbootstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.wdidada.test.mybatisspringbootstarter.mapper")
@SpringBootApplication
public class SpringMyBootApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringMyBootApplication.class, args);
    }
}
