package com.parth.propertyfileexample;

import com.parth.propertyfileexample.config.MessageFunctionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyFileExampleApplication implements CommandLineRunner {

    @Autowired
    MessageFunctionConfig config;

    public static void main(String[] args) {
        SpringApplication.run(PropertyFileExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        config.getMappings().forEach(System.out::println);
//        MessageService service = new MessageService();
//        MessageService.class.getMethod("method2").invoke(service);
    }
}
