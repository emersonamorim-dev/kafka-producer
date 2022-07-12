package com.codev.kafka.producer.resource;

import com.codev.kafka.producer.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {

    @Autowired
    MensagemService mensagemService;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem) {
        mensagemService.sendMessage(mensagem);
        return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + mensagem);
    }

}
