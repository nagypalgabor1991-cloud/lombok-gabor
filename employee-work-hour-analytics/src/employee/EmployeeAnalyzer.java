package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAnalyzer {

    private final List<Employee> employees;

    public EmployeeAnalyzer(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        List<Employee> output = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                output.add(employee);
            }
        }
        return output;
    }

    public void printTotalWeeklyHours() {
        System.out.printf("%nTotal weekly hours:%n");
        for (Employee employee : this.employees) {
            System.out.println(employee.getName() + ": " + employee.getTotalWeeklyHours() + " hours");
        }
    }

    public void printAverageDailyHours() {
        System.out.printf("%nAverage daily hours:%n");
        for (Employee employee : this.employees) {
            System.out.println(employee.getName() + ": " + employee.getAverageWeeklyHours() + " hours");
        }
    }

    public List<Employee> getEmployeesWithHighestTotalHours() {
        List<Employee> mvps = new ArrayList<>();
        int maxHours = 0;
        for (Employee emp : this.employees) {
            if (emp.getTotalWeeklyHours() > maxHours) {
                maxHours = emp.getTotalWeeklyHours();
            }
        }
        for (Employee emp : this.employees) {
            if (emp.getTotalWeeklyHours() == maxHours) {
                mvps.add(emp);
            }
        }
        return mvps;
    }

    public List<Employee> getEmployeeWithHighestTotalHours(String department) {
        List<Employee> departmentEmployees = getEmployeesByDepartment(department);
        List<Employee> mvps = new ArrayList<>();
        int maxHours = 0;
        for (Employee emp : departmentEmployees) {
            if (emp.getTotalWeeklyHours() > maxHours) {
                maxHours = emp.getTotalWeeklyHours();
            }
        }
        for (Employee emp : departmentEmployees) {
            if (emp.getTotalWeeklyHours() == maxHours) {
                mvps.add(emp);
            }
        }
        return mvps;
    }
}
