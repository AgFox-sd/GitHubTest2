package com.teams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 编写SpringBoot启动类
 */
@SpringBootApplication
@MapperScan("com.teams.mapper")
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
}
