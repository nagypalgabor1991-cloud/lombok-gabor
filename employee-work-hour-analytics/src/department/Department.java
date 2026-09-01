package department;

import employee.Employee;

import java.util.List;

public class Department {

    private final List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public double getAverageWeeklyHours(String department) {
        double totalHours = 0;
        int employeeCount = 0;

        for (Employee employee : this.employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                totalHours += employee.getTotalWeeklyHours();
                employeeCount++;
            }
        }
        if (employeeCount == 0) {
            return 0.0;
        }
        return totalHours / employeeCount;
    }
}
