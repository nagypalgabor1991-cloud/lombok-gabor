import csv.CsvUtils;
import department.Department;
import employee.Employee;
import employee.EmployeeAnalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        CsvUtils csvUtils = new CsvUtils();
        List<Employee> allEmployees = csvUtils.readEmployeesFromCsv("C:\\Users\\nagyp\\Saját meghajtó\\Java\\04_Homework\\employee-work-hour-analytics\\src\\csv\\employee_hours.csv");
        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(allEmployees);

        List<Employee> itDepartment = analyzer.getEmployeesByDepartment("IT");
        System.out.printf("%n%s%n", itDepartment);

        analyzer.printTotalWeeklyHours();

        analyzer.printAverageDailyHours();

        Department department = new Department(allEmployees);
        double itAverage = department.getAverageWeeklyHours("IT");
        System.out.printf(Locale.US, "%nIT department weekly average: %.2f hours%n", itAverage);

        List<Employee> employeesWithHighestTotalHours = analyzer.getEmployeesWithHighestTotalHours();
        List<String> nameOfEmployeesWithHighestTotalHours = new ArrayList<>();
        for (Employee employee : employeesWithHighestTotalHours) {
            nameOfEmployeesWithHighestTotalHours.add(employee.getName());
        }
        System.out.printf("%nEmployee with highest total hours globally is: %s%n", nameOfEmployeesWithHighestTotalHours);


        List<Employee> itEmployeesWithHighestTotalHours = analyzer.getEmployeeWithHighestTotalHours("IT");
        List<String> names = new ArrayList<>();
        for (Employee employee : itEmployeesWithHighestTotalHours) {
            names.add(employee.getName());
        }
        System.out.printf("%nEmployee with highest total hours in IT: %s%n", names);
    }
}
