package com.thetechyatra.onionarchspringboot.adapter.api.rest;

import com.thetechyatra.onionarchspringboot.application.service.api.MessageService;
import com.thetechyatra.onionarchspringboot.domain.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageRestAdapterV1 {
    private final MessageService messageService;

    @Autowired
    public MessageRestAdapterV1(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/create/")
    void createMessage(@RequestBody Message message) {
        messageService.sendMessage(message);

    }

    @GetMapping()
    public List<Message> getMessages(){
       return messageService.getMessages();
    }

    @GetMapping("/welcome")
    String  getWelcomeMessages() {
        return "Welcome to the message service";
    }
}
