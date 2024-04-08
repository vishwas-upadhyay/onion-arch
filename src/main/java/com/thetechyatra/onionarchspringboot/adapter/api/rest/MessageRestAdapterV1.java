package com.thetechyatra.onionarchspringboot.adapter.api.rest;

import com.thetechyatra.onionarchspringboot.application.service.api.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/messages")
public class MessageRestAdapterV1 {
    private final MessageService messageService;

    @Autowired
    public MessageRestAdapterV1(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/create")
    void createMessage( String text, String sender, String receiver) {
        messageService.sendMessage(text, sender, receiver);

    }
}
