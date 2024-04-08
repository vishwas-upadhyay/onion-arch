package com.thetechyatra.onionarchspringboot.adapter.spi.persistance;

import com.thetechyatra.onionarchspringboot.adapter.spi.persistance.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2MessageRepository extends JpaRepository<MessageEntity, String> {

}
