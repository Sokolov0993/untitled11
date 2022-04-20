package com.company;

public class Exception1 extends Exception {
    public Exception1() {
    }

    public Exception1(String message) {
        super(message);
    }

    public Exception1(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception1(Throwable cause) {
        super(cause);
    }

    public Exception1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

