package br.com.dawnmountain.strproducer.ressources;

import br.com.dawnmountain.strproducer.services.StringProducerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/producer")
@RequiredArgsConstructor
public class StringProducerRessource {

    private final StringProducerServices service;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message){
        this.service.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
