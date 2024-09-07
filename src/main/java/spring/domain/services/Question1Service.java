package spring.domain.services;

import org.springframework.stereotype.Service;

@Service
public class Question1Service {

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

}
