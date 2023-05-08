package com.psrth.propertyfileexample.controller;

import com.parth.propertyfileexample.config.MessageFunctionConfig;
import com.parth.propertyfileexample.pojo.MessageFunctionPojo;
import com.parth.propertyfileexample.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MessageController {

    private MessageService service;
    private MessageFunctionConfig config;

    public void processMessage(String messageFunction) throws NoSuchMethodException {
        Optional<MessageFunctionPojo> messageFunctionPojo = config.getMappings().stream().filter(mf ->
                mf.getMessageFunction().equalsIgnoreCase(messageFunction)).findFirst();

        if (messageFunctionPojo.isPresent()) {
            List<String> methods = messageFunctionPojo.get().getMethods();
            for (String method : methods) {
                Method method1 = MessageService.class.getMethod(method);
                method1.getParameters();
            }
        }
    }
}
