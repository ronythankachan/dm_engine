package com.cognicor.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class ChatResponse {
    private String id;
    private List<Bubble> bubbles;

    public static class Builder {
        private final ChatResponse chatResponse = new ChatResponse();

        public Builder buildId(String id) {
            chatResponse.id = id;
            return this;
        }

        public Builder buildBubbles(List<Bubble> bubbles) {
            chatResponse.bubbles = bubbles;
            return this;
        }

        public ChatResponse build() {
            return chatResponse;
        }

    }
}
