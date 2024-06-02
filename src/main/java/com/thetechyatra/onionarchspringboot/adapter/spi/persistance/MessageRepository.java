package com.thetechyatra.onionarchspringboot.adapter.spi.persistance;

import com.thetechyatra.onionarchspringboot.domain.model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.thetechyatra.onionarchspringboot.adapter.spi.persistance.entity.MessageList.messageList;
@Repository
public class MessageRepository {


    public List<Message> getMessages() {
        return messageList;
    }

    public void save(Message message) {
        messageList.add(message);
    }


}
