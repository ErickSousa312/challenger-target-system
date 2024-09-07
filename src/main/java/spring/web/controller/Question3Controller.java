package spring.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.records.FinallyProcess;

@RestController
@RequestMapping("Question3")
public class Question3Controller {

    @GetMapping
    public ResponseEntity<String> VariableSumValue() {
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        FinallyProcess process = new FinallyProcess(SOMA);
        return ResponseEntity.status(HttpStatus.OK).body(process.toString());
    }

}
