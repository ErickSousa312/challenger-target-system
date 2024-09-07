package spring.domain.records;

public record CountResultLetterA(int count) {
    @Override
    public String toString() {
        return "A letra 'A' ocorre " + count + " vez(es) na string.";
    }
}

