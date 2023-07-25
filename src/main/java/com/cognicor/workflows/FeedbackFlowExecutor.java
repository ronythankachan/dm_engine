package com.cognicor.workflows;

import com.cognicor.pojos.FeedbackRequest;
import com.cognicor.pojos.FeedbackResponse;
import org.springframework.stereotype.Component;

@Component
public class FeedbackFlowExecutor implements FlowExecutor<FeedbackRequest, FeedbackResponse> {

    @Override
    public FeedbackResponse execute(FeedbackRequest request) {
        return null;
    }
}
