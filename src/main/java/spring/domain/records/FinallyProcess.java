package spring.domain.records;

public record FinallyProcess(Integer sum) {

    @Override
    public String toString() {
        return "o Valor da soma da variável é: " + sum;
    }

}

