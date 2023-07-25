package com.cognicor.dto;

import com.cognicor.pojos.Bubble;
import com.cognicor.pojos.Bullet;
import com.cognicor.pojos.ChatResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class ChatResponseDTO {
    public ChatResponse prepare() {
        return new ChatResponse.Builder()
                .buildId(UUID.randomUUID().toString())
                .buildBubbles(buildBubbles())
                .build();
    }

    private List<Bubble> buildBubbles() {
        Bubble bubble1 = new Bubble.Builder()
                .buildId(UUID.randomUUID().toString())
                .buildContent("Hello world")
                .build();
        Bubble bubble2 = new Bubble.Builder()
                .buildId(UUID.randomUUID().toString())
                .buildBullets(List.of(new Bullet.Builder()
                        .buildId(UUID.randomUUID().toString())
                        .buildText("Sample bullet 1")
                        .build(), new Bullet.Builder()
                        .buildId(UUID.randomUUID().toString())
                        .buildText("Sample bullet 2")
                        .build()))
                .buildContent("Click one from below")
                .build();
        return new ArrayList<>(Arrays.asList(bubble1, bubble2));
    }

}
