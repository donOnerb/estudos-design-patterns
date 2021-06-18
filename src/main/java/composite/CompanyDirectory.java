package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employeeList;

    public CompanyDirectory() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    @Override
    public double getSalary() {
        var companyDirectorySalary = 0.0;
        for (Employee employee : employeeList) {
            companyDirectorySalary += employee.getSalary();
        }
        return companyDirectorySalary;
    }
}
