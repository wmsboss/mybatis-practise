package com.max.test.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 使用MapperScan批量扫描所有的Mapper接口
 *
 * 配置mapper扫描，有两种方式，
 * 一种是直接在UserMapper2上面添加@Mapper注解，这种方式有一个弊端就是所有的Mapper都要手动添加，要是落下一个就会报错，
 * 还有一个一劳永逸的办法就是直接在启动类上添加Mapper扫描
 */
@MapperScan("com.max.test.mybatis.mapper")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
