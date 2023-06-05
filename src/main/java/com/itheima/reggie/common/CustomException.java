package com.itheima.reggie.common;

import org.springframework.web.bind.annotation.PutMapping;

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
