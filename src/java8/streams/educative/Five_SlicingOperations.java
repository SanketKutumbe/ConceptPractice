package java8.streams.educative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Five_SlicingOperations {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");

        countries.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("---------");

        countries.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------");

        countries.stream()
                .distinct()
                .skip(2)
                .forEach(System.out::println);
    }
}
