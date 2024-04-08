package com.thetechyatra.onionarchspringboot.application.service.api;

import com.thetechyatra.onionarchspringboot.adapter.spi.persistance.H2MessageRepository;
import com.thetechyatra.onionarchspringboot.adapter.spi.persistance.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final H2MessageRepository messageRepository;

    @Autowired
    public MessageService( H2MessageRepository messageRepository) {
        this.messageRepository = messageRepository;

    }
    public void sendMessage(String text, String sender, String receiver) {
        MessageEntity message = new MessageEntity(text, sender, receiver);
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
}
