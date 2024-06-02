package com.thetechyatra.onionarchspringboot.domain.model;

public record Message(String text, String sender, String receiver, String timestamp) {

    public Message(String text, String sender, String receiver) {
        this(text, sender, receiver, String.valueOf(System.currentTimeMillis()));
    }

    public Message(String text, String sender, String receiver, long timestamp) {
        this(text, sender, receiver, String.valueOf(timestamp));
    }

    public Message(String text, String sender, String receiver, String timestamp){
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        }
        if (sender == null || sender.isBlank()) {
            throw new IllegalArgumentException("Sender cannot be null or empty");
        }
        if (receiver == null || receiver.isBlank()) {
            throw new IllegalArgumentException("Receiver cannot be null or empty");
        }
        if (timestamp == null || timestamp.isBlank()) {
            timestamp = String.valueOf(System.currentTimeMillis());
        }
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = timestamp;

    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (!text.equals(message.text)) return false;
        if (!sender.equals(message.sender)) return false;
        if (!receiver.equals(message.receiver)) return false;
        return timestamp.equals(message.timestamp);
    }

    public int hashCode() {
        int result = text.hashCode();
        result = 31 * result + sender.hashCode();
        result = 31 * result + receiver.hashCode();
        result = 31 * result + timestamp.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Message message = new Message("Hello", "Alice", "Bob");
        System.out.println(message);
    }
}
