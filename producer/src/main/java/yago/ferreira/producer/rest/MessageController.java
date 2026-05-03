package yago.ferreira.producer.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yago.ferreira.producer.domain.CustomMessage;
import yago.ferreira.producer.service.MessageService;

@RestController
@RequestMapping("/v1/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestBody CustomMessage message) {
        messageService.sendMessage(message);
        return ResponseEntity.ok().build();
    }
}
