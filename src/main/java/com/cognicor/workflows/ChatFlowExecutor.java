package com.cognicor.workflows;

import com.cognicor.dto.ChatResponseDTO;
import com.cognicor.pojos.ChatRequest;
import com.cognicor.pojos.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatFlowExecutor implements FlowExecutor<ChatRequest, ChatResponse> {

    @Autowired
    ChatResponseDTO chatResponseDTO;

    @Override
    public ChatResponse execute(ChatRequest request) {

        // To-Do input validation
        // To-Do checking redis context
        // To-Do getting NLU response
        // To-Do executing pipelines in parallel
        // To-Do chatResponse DTO
        // To-Do executing dashboard
        // To-Do returning result
        return chatResponseDTO.prepare();
    }
}
