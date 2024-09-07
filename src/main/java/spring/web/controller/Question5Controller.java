package spring.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/Question5")
public class Question5Controller {

    @GetMapping
    public ResponseEntity<Map<String, String>> question5() {
        Map<String, String> logic2 = new LinkedHashMap<>();
        logic2.put("Passo 1", "ligar o primeiro interruptor e deixar por um tempo uns 10 min");
        logic2.put("Passo 2", "desligar o primeiro interruptor e liguar o segundo");
        logic2.put("Passo 3", "ir ate as lampadas");
        logic2.put("Conclusão ", "a lampada quente é do interruptor 1, a lampada acessa é do interruptor 2 e a desligada é do interruptor 3");
        return ResponseEntity.ok().body(logic2);
    }

}
