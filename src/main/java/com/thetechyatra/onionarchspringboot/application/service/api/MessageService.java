package com.thetechyatra.onionarchspringboot.application.service.api;

import com.thetechyatra.onionarchspringboot.adapter.spi.persistance.MessageRepository;
import com.thetechyatra.onionarchspringboot.domain.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService( MessageRepository messageRepository) {
        this.messageRepository = messageRepository;

    }
    public void sendMessage(String text, String sender, String receiver) {
        Message message = new Message(text, sender, receiver);
        messageRepository.save(message);

    }

    public void sendMessage(Message message) {
        messageRepository.save(message);

    }

    public void deleteMessage(String id) {
        // delete message
    }

    public void updateMessage(String id, String text) {
        // update message
    }

    public void getMessage(String id) {
        // get message
    }

    public List<Message> getMessages() {
        return messageRepository.getMessages();
    }
}
