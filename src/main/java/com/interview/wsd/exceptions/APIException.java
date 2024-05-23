package com.interview.wsd.exceptions;

public class APIException extends RuntimeException {
    public APIException(String msg) {
        super(msg);
    }

    public APIException(String msg, Throwable errorDetails){
        super(msg, errorDetails);
    }
}
