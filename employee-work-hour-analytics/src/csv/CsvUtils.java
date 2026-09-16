package csv;

import employee.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public List<Employee> readEmployeesFromCsv(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (int i = 1; i < lines.size(); i++) {
                employees.add(parseEmployeeFromCsvLine(lines.get(i)));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return employees;
    }

    private Employee parseEmployeeFromCsvLine(String line) {
        String[] data = line.split(",");
        String name = data[0].trim();
        String department = data[1].trim();
        List<Integer> hours = parseHours(data);

        return new Employee(name, department, hours);
    }

    private List<Integer> parseHours(String[] data) {
        List<Integer> hours = new ArrayList<>();
        for (int i = 2; i < data.length; i++) {
            hours.add(Integer.parseInt(data[i].trim()));
        }
        return hours;
    }
}