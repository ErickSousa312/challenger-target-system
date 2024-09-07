package spring.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.services.Question1Service;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/Question4")
public class Question4Controller {

    @GetMapping
    public ResponseEntity<Map<String, String>> question4() {
        Map<String, String> logic = new LinkedHashMap<>();
        logic.put("a) 1, 3, 5, 7, ___", " próximo elemento é 9 ");
        logic.put("b) 2, 4, 8, 16, 32, 64, ___", "próximo elemento é 128");
        logic.put("c) 0, 1, 4, 9, 16, 25, 36, ___", "próximo elemento é 49");
        logic.put("d) 4, 16, 36, 64, ___", "próximo elemento é 100");
        logic.put("e) 1, 1, 2, 3, 5, 8, ___", "próximo elemento é 13");
        logic.put("f) 2,10, 12, 16, 17, 18, 19, ___", "próximo elemento é 200");
        return ResponseEntity.ok().body(logic);
    }
}
