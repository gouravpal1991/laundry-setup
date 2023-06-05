package functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class StreamsAndLambdaOnObject {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(2001, "John", "Doe", "Software Engineer", 32),
                new Employee(2095, "Kyle", "Miller", "Software Engineer", 25),
                new Employee(3018, "Adams", "Baker", "HR", 42),
                new Employee(3034, "Clark", "Davis", "HR", 22),
                new Employee(3034, "Klein", "Lopez", "CEO", 51)
        );

        // check if all the employees above age of 40
        Predicate<Employee> employeePredicateAgeAbove40 = employee -> employee.getAge() > 40;

        boolean isAllEmployeeAbove40 = employeeList.stream()
                .allMatch(employeePredicateAgeAbove40);
        System.out.println(isAllEmployeeAbove40);
    }
}
