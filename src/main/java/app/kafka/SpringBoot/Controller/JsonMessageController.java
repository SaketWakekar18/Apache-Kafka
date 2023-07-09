package app.kafka.SpringBoot.Controller;

import app.kafka.SpringBoot.Kafka.JsonKafkaProducer;
import app.kafka.SpringBoot.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka/json")
public class JsonMessageController {
    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;
    @PostMapping("/postUser")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON object successfully sent to Kafka Topic");
    }
}
