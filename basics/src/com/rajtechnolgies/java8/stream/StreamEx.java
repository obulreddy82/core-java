package com.rajtechnolgies.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx {
    public static void main(String[] args) {
        List<List<String>> names = List.of(Arrays.asList("Rajesh", "Pallavi", "Cherry", "OBUL"),
                Arrays.asList("Ramesh", "Suresh", "Kiran", "Pallavi"));
        //forEach
        names.stream()
                //.filter(s ->  s.equals("Pallavi"))
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .limit(3)//it will display only 3 elements
                .skip(1)//skip the element and print remaining elements
                //.map(String::toUpperCase)
                //.collect(Collectors.toList());
                .forEach(System.out::println);
        //
        List<String> filterResult = names.stream()
                //.filter(s ->  s.equals("Pallavi"))
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .peek(n -> System.out.println("After filter: " + n))
                .distinct()
                .sorted()
                .limit(3)//it will display only 3 elements
                .skip(1)//skip the element and print remaining elements
                //.map(String::toUpperCase)
                .collect(Collectors.toList());
        //  .count();
        System.out.println(filterResult);

        //Collectors.joining
        String collectorsJoining = names.stream()
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .collect(Collectors.joining(","));

        System.out.println("Collectors Joining: " + collectorsJoining);

        //Collectors.joining with prefix and suffix
        String prefixSuffixCollectorJoining = names.stream()
                .flatMap(name -> name.stream().map(String::toUpperCase))
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("prefix suffix collector joining: " + prefixSuffixCollectorJoining);

        //Custom sorting:
        List<String> customSorting = names.stream()
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println("Customer Sorting" + customSorting);
        //Count
        long count = names.stream()
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .distinct()
                .sorted()

                .limit(3)//it will display only 3 elements
                .skip(1)//skip the element and print remaining elements
                .count();
        System.out.println(count);
        //max
        //findFirst
        Optional<String> findFirst = names.stream()
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .distinct()
                .sorted()
                .limit(3)//it will display only 3 elements
                .skip(1)//skip the element and print remaining elements
                .findFirst();
        System.out.println(findFirst.orElse(null));

        //findFirst
        Optional<String> findAny = names.stream()
                .flatMap(a -> a.stream().map(String::toUpperCase))
                .distinct()
                .sorted()
                .limit(3)//it will display only 3 elements
                .skip(1)//skip the element and print remaining elements
                .findAny();
        System.out.println(findAny.orElse(null));


        List<Integer> numbers = Arrays.asList(10, 20, 30, 4, 5, 6, 7, 8, 9, 10, 3);

        //Terminal Operators
        //count
        long numberCount = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Count Numbers:" + numberCount);

        //min value
        long minValue = numbers.stream().min(Long::compare).orElse(0);
        System.out.println("minimum value:" + minValue);

        //max value
        long maxValue = numbers.stream().max(Long::compare).orElse(0);
        System.out.println("maximum value:" + maxValue);

        //reduce
        long sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum:" + sum);

        //reduce without identify
        Optional<Integer> sumValue = numbers.stream().reduce(Integer::sum);
        System.out.println("sumValue:" + sumValue.get());

        //Sum
        int sumValues = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sumValues:" + sumValues);
        //Average
        OptionalDouble averageValue = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("averageValue:" + averageValue.getAsDouble());

        //Primitive Streams, IntStream, DoubleStream, LongStream

        IntStream.range(1, 10).forEach(System.out::println);
        //mapToInt()
        List<String> actualNames =
                List.of("John", "Alice", "Bob","Rajesh");
        int actualNameLength = actualNames.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(actualNameLength);

        //AnyMatch
        boolean rajeshFounded = actualNames.stream()
                .anyMatch(s -> s.contains("Rajesh"));
        System.out.println("AnyMatch:" + rajeshFounded);

        boolean rajeshAllMatch = actualNames.stream()
                .allMatch(s -> s.contains("Rajesh"));
        System.out.println("All Match:" + rajeshAllMatch);
        //Checks whether no elements match.
        boolean rajeshNoneMatch = actualNames.stream()
                .noneMatch(s -> s.contains("Rajesh1"));
        System.out.println("None Match:" + rajeshNoneMatch);

        //FindAny
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9,10,20);
        Optional<Integer> result =
                oddNumbers.stream()
                        .filter(n -> n % 2 == 0)
                        .findAny();
        System.out.println("result:"+ result.orElse(0));
//groupingBy() with Summing
        //Group By and sum of the salary
        List<Employee> employees=getEmployees();
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDesignation,Collectors.summingDouble(Employee::getSalary)))
                //.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue().stream().mapToDouble(Employee::getSalary).sum())
                .forEach((s, aDouble) -> System.out.println(s + " : " + aDouble));
        //Grouped by department and count the each department

        employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.counting())).forEach((k,v)->System.out.println(k+":"+v));

        //Grouped by department and average
        employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.averagingDouble(Employee::getSalary))).forEach((k,v)->System.out.println(k+":"+v));
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Obul", 25, "Developer", 10000));
        employees.add(new Employee("Raj", 25, "Developer", 20000));
        employees.add(new Employee("Pallavi", 25, "Developer", 30000));
        employees.add(new Employee("Rajesh", 25, "Developer", 10000));
        employees.add(new Employee("Sushma", 30, "Tester", 30000));
        employees.add(new Employee("Krishna", 30, "Tester", 40000));
        employees.add(new Employee("Rama", 30, "Admin", 50000));
        employees.add(new Employee("Siva", 30, "Admin", 60000));
        return employees;
    }
}
