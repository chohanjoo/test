package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class ExampleController {

    @PostMapping("/getNotification")
    @ApiOperation(value = "hello")
    public ResponseEntity example() {
        log.info("==== start api ====");
        log.info("print hello world");
        log.info("==== end api ====");
        return ResponseEntity.ok("hello world");
    }
}
