package com.cognicor.controllers;

import com.cognicor.pojos.FeedbackRequest;
import com.cognicor.pojos.FeedbackResponse;
import com.cognicor.workflows.FeedbackFlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/feedback")
public class FeedbackController {

    @Autowired
    FeedbackFlowExecutor feedbackFlowExecutor;

    @PostMapping
    public ResponseEntity<FeedbackResponse> feedback(@RequestBody FeedbackRequest feedbackRequest) {
        FeedbackResponse feedbackResponse = feedbackFlowExecutor.execute(feedbackRequest);
        return new ResponseEntity<>(feedbackResponse, HttpStatus.OK);
    }

}
