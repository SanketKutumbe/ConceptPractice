package java8.streams.educative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class One_Introduction {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
//        stream.forEach(p -> System.out.println(p));

        int[] arr = {1,2,3,4,5,6};
        List<Integer> list = new ArrayList<>();
        for(int a: arr) list.add(a);

        Stream<Integer> str = list.stream();
        str.filter(i -> i%2 == 0).forEach(System.out::println);
    }
}
