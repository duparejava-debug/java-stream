package Practice_2;

import java.util.Arrays;
import java.util.List;

public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);
        //o/p: 5,2,8,3,9

        List<Integer> list = numbers.stream()
                .distinct()
                .toList();
        System.out.println(list);
    }
}
