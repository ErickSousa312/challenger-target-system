package spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.domain.services.Question1Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/Question1")
@RequiredArgsConstructor
public class Question1Controller {

    private final Question1Service question1Service;

    @GetMapping("/{number}")
    public ResponseEntity<Map<String,String>> fibonacci(@PathVariable Integer number) {
        Map<String, String> numbersFibonacci = IntStream.rangeClosed(0,number).boxed()
                .collect(Collectors.toMap(
                        String::valueOf,
                        n -> Question1Service.isFibonacci(n) ? " é Fibonacci" : " não é Fibonacci",
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        return ResponseEntity.status(HttpStatus.CREATED).body(numbersFibonacci);
    }

}
