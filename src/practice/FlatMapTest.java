package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int i = 1; while( i < 10 ) list.add(i++);
        System.out.println(list);
        List<List<Integer>> lol = new ArrayList<>();
        lol.add(list);
        list = new ArrayList<>();
        while(i < 20) list.add(i++);
        lol.add(list);
        System.out.println(lol);

        lol.stream().flatMapToInt(s -> IntStream.of((s.size()))).forEach(System.out::println);
    }
}
