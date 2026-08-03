package csv;

import employee.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {
    public List<Employee> readEmployeesFromCsv(String filePath) {
        List<Employee> employees = new ArrayList<>();
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i =1; i< lines.size(); i++) {
                String line = lines.get(i);
                String[] data = line.split(",");
                String name = data[0];
                String department = data[1];
                List<Integer> hours = new ArrayList<>();
                for(int j = 2; j<data.length; j++) {
                    int hour = Integer.parseInt(data[j]);
                    hours.add(hour);
                }
                Employee employee = new Employee(name, department, hours);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return employees;
    }
}
