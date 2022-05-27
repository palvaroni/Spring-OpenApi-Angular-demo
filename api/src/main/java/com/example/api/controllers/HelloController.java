package com.example.api.controllers;

import com.example.api.dtos.MessageDTO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Hello")
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public MessageDTO get(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new MessageDTO(String.format("Hello %s!", name));
    }
}
