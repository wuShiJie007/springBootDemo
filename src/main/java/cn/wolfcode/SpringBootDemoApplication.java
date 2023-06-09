package cn.wolfcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// 启动类，一个项目只有一个，固定写法
@SpringBootApplication // 都会贴这个注解
public class SpringBootDemoApplication {

	// 固定写法
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
