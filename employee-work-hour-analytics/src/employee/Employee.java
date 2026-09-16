package employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Integer> dailyHours;

    public Employee(String name, String department, List<Integer> dailyHours) {
        this.name = name;
        this.department = department;
        this.dailyHours = dailyHours;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Integer> getDailyHours() {
        return dailyHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDailyHours(List<Integer> dailyHours) {
        this.dailyHours = dailyHours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", dailyHours=" + dailyHours +
                '}';
    }

    public int getTotalWeeklyHours() {
        int sum = 0;
        for (int hour : this.dailyHours) {
            sum += hour;
        }
        return sum;
    }

    public double getAverageWeeklyHours() {
        return getTotalWeeklyHours() / 5.0;
    }
}


