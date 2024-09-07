package spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.records.CountResultLetterA;
import spring.domain.services.Question2Service;

@RestController
@RequestMapping("/Question2")
@RequiredArgsConstructor
public class Question2Controller {

    private final Question2Service question2Service;

    @GetMapping("/{word}")
    public ResponseEntity<String> countA(@PathVariable String word) {
        int countNumberA =  question2Service.countOccurrencesLetterA(word);
        CountResultLetterA count =  new CountResultLetterA(countNumberA);
        return ResponseEntity.status(HttpStatus.CREATED).body(count.toString());
    }
}
