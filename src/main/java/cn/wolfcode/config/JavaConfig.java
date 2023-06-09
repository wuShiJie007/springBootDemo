package cn.wolfcode.config;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@PropertySource("classpath:application.properties")
@ConfigurationProperties("jdbc")
@Setter
@ToString
public class JavaConfig {
    //@Value("${jdbc.driverClassName}")
    private String driverClassName;

    //@Value("${jdbc.url}")
    private String url;

    //@Value("${jdbc.username}")
    private String username;

    //@Value("${jdbc.password}")
    private String password;
}
