package spring.domain.services;


import org.springframework.stereotype.Service;

@Service
public class Question2Service {

    public int countOccurrencesLetterA(String word) {
        if(word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty");
        };
        return (int) word.toLowerCase().chars().filter(c-> c == 'a').count();
    }
}
