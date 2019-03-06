package com.business.userservice.model;

/**
 * Posted from Mar 06, 2019, 10:48 10
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
public class Greet {
    private String message;

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
