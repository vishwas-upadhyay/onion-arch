package com.thetechyatra.onionarchspringboot.service.service;

import com.thetechyatra.onionarchspringboot.domain.model.GreetingCriteria;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements com.thetechyatra.onionarchspringboot.domain.interfaces.GreetingService  {
    @Override
    public String getGreeting(GreetingCriteria greetingCriteria) {
        return "Hello";
    }
}
