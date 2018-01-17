package com.hf.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(locations = "classpath:server.properties",prefix = "server.info")
public class SpecialProperties {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String address;
    private String username;
    private String password;
    public String toString(){
        return "SpecialProperties{" +
                "address=" + address + ","
                +"username=" + username +"," +
                "password=" + password + "}";

    }
}
