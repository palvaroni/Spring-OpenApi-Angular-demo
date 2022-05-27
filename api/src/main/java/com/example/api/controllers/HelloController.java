package com.example.api.controllers;

import com.example.api.dtos.HelloDTO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Hello")
public class HelloController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloDTO get(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new HelloDTO(String.format("Hello %s!", name));
    }
}
