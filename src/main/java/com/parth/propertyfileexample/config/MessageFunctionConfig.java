package com.parth.propertyfileexample.config;

import com.parth.propertyfileexample.pojo.MessageFunctionPojo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "message-functions")
public class MessageFunctionConfig {

    List<MessageFunctionPojo> mappings;
}
