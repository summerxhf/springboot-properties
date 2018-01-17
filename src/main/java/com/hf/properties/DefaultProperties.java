package com.hf.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix  = "server.info")
public class DefaultProperties {
    //只有默认的配置文件才可以,value标签.
    @Value("${server.info.address}")
    private String address;
    @Value("${server.info.username}")
    private String username;
    @Value("${server.info.password}")
    private String password;

    public String toString(){
        return "DefaultProperties{" +
                "address=" + address + ","
                +"username=" + username +"," +
                "password=" + password + "}";

    }
}
