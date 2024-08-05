package com.octoSports.checkTeam.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {
    private Logger LOGGER= LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"fetchAllTeams-Topic"},groupId = "myGroupId",containerFactory="consumer")
    public void listener(Boolean message){
        LOGGER.info("Mensjae recibido,el mensaje es: " + message);
    }
}
