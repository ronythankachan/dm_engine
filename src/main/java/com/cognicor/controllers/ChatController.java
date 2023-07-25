package com.cognicor.controllers;

import com.cognicor.pojos.ChatRequest;
import com.cognicor.pojos.ChatResponse;
import com.cognicor.workflows.ChatFlowExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/chat")
public class ChatController {

    private static final Logger logger = LoggerFactory.getLogger(ChatController.class);

    @Autowired
    ChatFlowExecutor chatFlowExecutor;

    @PostMapping
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
        logger.debug("Inside chat controller with request {}", chatRequest.toString());
        ChatResponse chatResponse = chatFlowExecutor.execute(chatRequest);
        return new ResponseEntity<>(chatResponse, HttpStatus.OK);
    }
}
