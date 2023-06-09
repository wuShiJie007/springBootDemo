package cn.wolfcode;

import cn.wolfcode.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

// 测试类，一定贴 @SpringBootTest，启动 Spring 容器
// 根据启动类（配置类）启动 Spring 容器
@SpringBootTest
class SpringBootDemoApplicationTests {

	@Autowired
	private JavaConfig javaConfig;

	@Autowired
	private Environment environment;

	@Test
	void contextLoads() {
		//System.out.println(javaConfig);
		//System.out.println(environment.getProperty("jdbc.driverClassName"));
		System.out.println(environment.getProperty("user.home"));
	}

}
