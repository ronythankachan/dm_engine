package com.cognicor.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bubble {
    private String id;
    private String content;
    private List<Bullet> bullets;

    public static class Builder {
        private final Bubble bubble;

        public Builder() {
            bubble = new Bubble();
        }

        public Builder buildId(String id) {
            bubble.id = id;
            return this;
        }

        public Builder buildContent(String content) {
            bubble.content = content;
            return this;
        }


        public Builder buildBullets(List<Bullet> bullets) {
            bubble.bullets = bullets;
            return this;
        }

        public Bubble build() {
            return bubble;
        }
    }
}
