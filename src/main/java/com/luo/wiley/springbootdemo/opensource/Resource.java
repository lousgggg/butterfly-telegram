package com.luo.wiley.springbootdemo.opensource;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "com.luo.wiley.springbootdemo.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String website;

    @Getter
    @Setter
    private String language;
}
