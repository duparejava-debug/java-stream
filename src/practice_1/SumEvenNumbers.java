package practice_1;

import java.util.Arrays;
import java.util.List;

//import java.util.stream.*;
//import java.util.function.*;
public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(evenSum);
    }
}
