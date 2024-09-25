package com.jj.jj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jj.jj.mapper")
public class JjApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjApplication.class, args);
    }

}
