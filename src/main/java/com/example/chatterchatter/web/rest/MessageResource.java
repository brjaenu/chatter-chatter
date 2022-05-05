package com.example.chatterchatter.web.rest;

import com.example.chatterchatter.model.dto.MessageDTO;
import com.example.chatterchatter.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageResource {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public ResponseEntity<List<MessageDTO>> getAll() {
        var messages = messageService.findAll();
        return new ResponseEntity<>(MessageDTO.fromAll(messages), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<MessageDTO> create(@RequestBody MessageDTO messageDTO) {
        var message = messageService.create(messageDTO);
        return new ResponseEntity<>(MessageDTO.from(message), HttpStatus.OK);
    }
}