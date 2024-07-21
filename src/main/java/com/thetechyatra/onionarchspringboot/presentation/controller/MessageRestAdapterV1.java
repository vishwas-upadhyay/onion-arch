package com.thetechyatra.onionarchspringboot.presentation.controller;

import com.thetechyatra.onionarchspringboot.domain.interfaces.GreetingService;
import com.thetechyatra.onionarchspringboot.domain.model.GreetingCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/greet")
@RequiredArgsConstructor
public class MessageRestAdapterV1 {
    private final GreetingService greetingService;

    @GetMapping()
    public String getMessages(String sender, String language, String timestamp) {

        GreetingCriteria greetingCriteria = GreetingCriteria.builder()
                .sender(sender)
                .language(language)
                .timestamp(timestamp)
                .build();
        return greetingService.getGreeting(greetingCriteria);
    }

    @GetMapping("/welcome")
    String getWelcomeMessages() {
        return "Welcome to the message service";
    }
}
