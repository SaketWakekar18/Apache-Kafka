package app.kafka.SpringBoot.Kafka;

import app.kafka.SpringBoot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class JsonKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "JsonFirstTopic", groupId = "myGroup")
    public void listen(User user){
        logger.info(String.format("Message recieved as User Object successfully... %s",user.toString()));
    }

}
