package com.cc.tspring.util;

import org.springframework.http.ResponseEntity;

public class CustomResponse<T> {
    private String message;
    private T data;
    private int status;

    public CustomResponse<T> message(String message) {
        this.message = message;
        return this;
    }

    public CustomResponse<T> data(T data) {
        this.data = data;
        return this;
    }

    public CustomResponse<T> status(int status) {
        this.status = status;
        return this;
    }

    public ResponseEntity<CustomResponse<T>> build() {
        return ResponseEntity.status(this.status).body(this);
    }
}
