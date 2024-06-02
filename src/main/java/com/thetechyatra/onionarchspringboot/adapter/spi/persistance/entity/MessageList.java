package com.thetechyatra.onionarchspringboot.adapter.spi.persistance.entity;

import com.thetechyatra.onionarchspringboot.domain.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageList {

    public static List<Message> messageList = new ArrayList<Message>(List.of(
            new Message("Hello", "Alice", "Bob"),
            new Message("Hi", "Bob", "Alice"),
            new Message("How are you?", "Alice", "Bob"),
            new Message("I am good", "Bob", "Alice"),
            new Message("What are you doing?", "Alice", "Bob"),
            new Message("Nothing much", "Bob", "Alice"),
            new Message("Goodbye", "Alice", "Bob"),
            new Message("Bye", "Bob", "Alice")));

    class MessageRequest{
        String text;
        String sender;
        String receiver;

        private MessageRequest(String text, String sender, String receiver) {
            this.text = text;
            this.sender = sender;
            this.receiver = receiver;
        }

    }
}
