package employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeAnalyzerTest {

    private List<Employee> testEmployees;
    private EmployeeAnalyzer analyzer;

    @BeforeEach
    void setUp() {
        Employee emp1 = new Employee("Kiss Bela", "IT", List.of(8, 8, 8, 8, 8));
        Employee emp2 = new Employee("Nagy Anna", "Marketing", List.of(9, 9, 9, 9, 4));
        Employee emp3 = new Employee("Toth Tibor", "IT", List.of(7, 7, 7, 7, 7));
        Employee emp4 = new Employee("Szabo Eva", "Engineering", List.of(10, 10, 10, 10, 10));
        testEmployees = List.of(emp1, emp2, emp3, emp4);
        analyzer = new EmployeeAnalyzer(testEmployees);
    }

    @Test
    void shouldReturnEmployeesByDepartment() {
        //given, when
        List<Employee> itEmployees = analyzer.getEmployeesByDepartment("IT");
        List<Employee> expected = new ArrayList<>();
        expected.add(testEmployees.get(0));
        expected.add(testEmployees.get(2));
        //then
        assertEquals(itEmployees, expected);
    }

    @Test
    void shouldReturnEmployeesWithHighestTotalHours() {
        //given, when
        List<Employee> topEmployees = analyzer.getEmployeesWithHighestTotalHours();
        List<Employee> expected = new ArrayList<>();
        expected.add(testEmployees.get(3));
        //then
        assertEquals(topEmployees, expected);
    }

    @Test
    void shouldReturnEmployeesWithHighestTotalHoursAtDepartment() {
        //given, when
        List<Employee> topEmployees = analyzer.getEmployeeWithHighestTotalHours("IT");
        List<Employee> expected = new ArrayList<>();
        expected.add(testEmployees.get(0));
        //then
        assertEquals(topEmployees, expected);
    }
}

