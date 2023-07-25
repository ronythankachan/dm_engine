package com.cognicor.pojos;


import lombok.Data;

@Data
public class ChatRequest {
    private String query;
    private String chatId;
}
