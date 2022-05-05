package com.example.chatterchatter.web.rest;

import com.example.chatterchatter.model.dto.SubjectDTO;
import com.example.chatterchatter.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectResource {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/all")
    public ResponseEntity<List<SubjectDTO>> getAll() {
        var subjects = subjectService.findAll();
        return new ResponseEntity<>(SubjectDTO.fromAll(subjects), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<SubjectDTO> create(@RequestBody SubjectDTO subjectDTO) {
        var subject = subjectService.create(subjectDTO);
        return new ResponseEntity<>(SubjectDTO.from(subject), HttpStatus.OK);
    }
}
