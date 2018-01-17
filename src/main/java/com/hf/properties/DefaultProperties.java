package com.hf.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix  = "server.info")
public class DefaultProperties {
    //ֻ��Ĭ�ϵ������ļ��ſ���,value��ǩ.
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
