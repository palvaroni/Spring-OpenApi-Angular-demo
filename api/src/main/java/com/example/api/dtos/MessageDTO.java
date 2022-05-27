package com.example.api.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MessageDTO {
    public String message;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public Date timestamp;

    public MessageDTO(String message) {
        this.message = message;
        this.timestamp = new Date();
    }
}
