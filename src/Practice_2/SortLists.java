package Practice_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLists {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2, 10);

        List<Integer> list = numbers.stream()
                .sorted(Comparator.reverseOrder()) //for decending order
                .toList();
        System.out.println(list);
    }
}
