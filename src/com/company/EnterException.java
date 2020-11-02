package com.company;

public class EnterException extends Exception {
    public EnterException() {
    }

    public EnterException(String message) {
        super(message);
    }

    public EnterException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnterException(Throwable cause) {
        super(cause);
    }

    public EnterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
