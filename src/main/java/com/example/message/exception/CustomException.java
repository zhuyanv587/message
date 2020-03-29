package com.example.message.exception;

import com.example.message.common.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CustomException extends Exception {
    protected Integer code;
    protected String message;
    public CustomException(ExceptionType type){
        this.code = type.getCode();
        this.message = type.getMsg();
    }
}
