package java8.streams.educative;

import java8.streams.educative.custom.CustomFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
The streams operations can be further classified as:

    filtering
    slicing
    mapping
    matching and finding
    reduction
    collect

 */

/*
    The filtering operations filters the given stream and returns a new stream, which contains only those elements that are required for the next operation.
    original list is not modified.
 */
public class Second_IntermediateOperations {

    public static void main(String[] args) {

//        filtering();
//        CustomFilter.main();
//
//        mapping();
//        intMapping();
        flatMapping();

    }

    private static void mapping() {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");
        // map() is used to convert each name to upper case.
        // Note: The map() method does not modify the original list.
        list.stream()
                .map(name -> name.toUpperCase()) //map() takes an input of Function<T, R> type.
                .forEach(System.out::println);
    }

    private static void flatMapping() {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a","b","c"));
        list.add(Arrays.asList("d","e","f"));
        list.add(Arrays.asList("g","h","i"));
        list.add(Arrays.asList("j","k","l"));
        //Created a stream from the list.
        Stream<List<String>> stream1 = list.stream();
        // Flattened the stream.
        Stream<String> stream2 = stream1.flatMap(s -> s.stream());
        //Applied filter on flattened stream.
        Stream<String> stream3 = stream2.filter(x -> "a".equals(x));

        stream3.forEach(System.out::println);
    }

    private static void intMapping() {

        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");

        list.stream()
                .mapToInt(name -> name.length())
                .forEach(System.out::println);
    }

    private static void filtering() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(6);

        list.stream()                           // Created a stream from the list
                .filter(num -> num > 10)        //filter operation to get only numbers greater than 10
                .forEach(System.out::println);
    }


}
