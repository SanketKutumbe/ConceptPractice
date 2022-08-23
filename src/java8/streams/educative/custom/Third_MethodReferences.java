package java8.streams.educative.custom;

import java.util.ArrayList;
import java.util.List;

/*
There are four kinds of method references:
1. Static methods
2. Instance method of a particular object
3. Instance method of an arbitrary object
4. Constructor references

 */
public class Third_MethodReferences {

    public static int getLength(String str) {
        return str.length();
    }

    public int getLen(String str) {
        return str.length();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");

        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("Dave", 23, 20000));
        list2.add(new Employee("Joe", 18, 40000));
        list2.add(new Employee("Ryan", 54, 100000));
        list2.add(new Employee("Iyan", 5, 34000));
        list2.add(new Employee("Ray", 63, 54000));

        Third_MethodReferences demo = new Third_MethodReferences();

        // 1.Works for String list
        System.out.println("-------Static Method Reference for same class---------");
        list.stream().mapToInt(Third_MethodReferences::getLength).forEach(System.out::println);
        System.out.println("----------------");

        // 2.Works for String list
        System.out.println("------- Method Reference---------");
        list.stream().mapToInt(demo::getLen).forEach(System.out::println);
        System.out.println("----------------");

        // 3. Works for EMPLOYEE list
        System.out.println("------- Method Reference with different class---------");
        int totalSalary = list2.stream().mapToInt(Employee::getAge).sum();
        System.out.println(totalSalary);
        System.out.println("----------------");

        // 4.Works for String list
        System.out.println("-------Contructor Reference---------");
        list.stream().map(Employee::new).forEach(System.out::println);
        System.out.println("----------------");

    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


