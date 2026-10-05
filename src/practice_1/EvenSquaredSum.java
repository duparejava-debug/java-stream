package practice_1;

import java.util.Arrays;
import java.util.List;

public class EvenSquaredSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.stream().filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        // we use method reference also inside reduce method
        System.out.println(sum);
    }
}
