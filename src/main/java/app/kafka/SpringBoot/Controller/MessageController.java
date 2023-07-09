package app.kafka.SpringBoot.Controller;

import app.kafka.SpringBoot.Kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")

public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/getMessage")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to topic successfully");
    }
}
