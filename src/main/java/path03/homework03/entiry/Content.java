package path03.homework03.entiry;

public class Content {

    private String body;

    private String signature;

    public Content(Builder builder) {
        this.body = builder.body;
        this.signature = builder.signature;
    }

    public static class Builder {
        private String body;
        private String signature;

        public Builder body(String bodyText) {
            this.body = bodyText;
            return this;
        }

        public Builder signature(String sign) {
            this.signature = sign;
            return this;
        }

        public Content build() {
            return new Content(this);
        }
    }

    @Override
    public String toString() {
        return String.format("{body text = %s, signature text = %s}", body, signature);
    }

}
