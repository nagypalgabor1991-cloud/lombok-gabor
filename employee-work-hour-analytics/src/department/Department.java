package department;

import employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private final List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public double getAverageWeeklyHours(String department) {
        List<Employee> deptEmployees = new ArrayList<>();
        for (Employee emp : this.employees) {
            if (emp.getDepartment().equalsIgnoreCase(department)) {
                deptEmployees.add(emp);
            }
        }
        if (deptEmployees.isEmpty()) {
            return 0.0;
        }
        double totalHours = 0;
        for (Employee emp : deptEmployees) {
            totalHours += emp.getTotalWeeklyHours();
        }
        return totalHours / deptEmployees.size();
    }
}
