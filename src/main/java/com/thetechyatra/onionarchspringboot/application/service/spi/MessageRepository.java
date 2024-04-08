package com.thetechyatra.onionarchspringboot.application.service.spi;

import com.thetechyatra.onionarchspringboot.domain.model.Message;

public interface MessageRepository {
    void saveMessage(Message message);
//    Message findById(String id);
//    void deleteById(String id);
//    void update(Message message);
}
