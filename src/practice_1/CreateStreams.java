package practice_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Nilesh", "Kiran");
        //1. List -> Stream
        Stream<String> stream = names.stream();

        String[] arr = {"Java", "Python", "C++"};
        //2. Array -> Stream

        //Arrays.stream(arr)

        //3. Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //4. Stream generate method
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
    }
}
