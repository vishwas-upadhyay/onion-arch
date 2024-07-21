package com.thetechyatra.onionarchspringboot.domain.interfaces;

import com.thetechyatra.onionarchspringboot.domain.model.GreetingCriteria;

public interface GreetingService {
    String getGreeting(GreetingCriteria greetingCriteria);
}
