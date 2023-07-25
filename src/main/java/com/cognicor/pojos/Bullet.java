package com.cognicor.pojos;

import lombok.Data;

@Data
public class Bullet {
    private String id;
    private String text;

    public static class Builder {
        private final Bullet bullet = new Bullet();

        public Builder buildId(String id) {
            bullet.id = id;
            return this;
        }

        public Builder buildText(String text) {
            bullet.text = text;
            return this;
        }

        public Bullet build() {
            return bullet;
        }
    }
}
