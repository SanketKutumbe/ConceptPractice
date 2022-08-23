package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomObjectFetch {

    public static void main(String[] args) {

        Author au = new Author("Jason", "Statham");
        Author au2 = new Author("Sylvester", "Stalone");

//        fetchName(au, au2);
        List<String> result = fetchName(au, au2);
        System.out.println(result);
    }

    private static List<String> fetchName(Author...authors) {

        List<Author> list = new ArrayList<>();
        for(Author a: authors) list.add(a);

        return list.stream().map(Author::getFname).collect(Collectors.toList());
    }
}
