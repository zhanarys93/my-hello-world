package com.zhanarys.almaty.javajunior.myhelloworld;

import com.zhanarys.almaty.javajunior.myhelloworld.model.Messages;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MappedTypes(Messages.class)
@MapperScan("com.zhanarys.almaty.javajunior.myhelloworld.mapper")
@SpringBootApplication
public class MyHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHelloWorldApplication.class, args);
	}
}
