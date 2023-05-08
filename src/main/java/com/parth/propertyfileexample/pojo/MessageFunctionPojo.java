package com.parth.propertyfileexample.pojo;

import lombok.Data;

import java.util.List;

@Data
public class MessageFunctionPojo {
    private String messageFunction;
    private List<String> methods;
}
