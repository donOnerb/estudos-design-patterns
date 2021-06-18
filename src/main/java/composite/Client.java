package composite;

public class Client {

    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer", 10000);
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer", 5000);
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Kushagra Garg", "Senior Manager", 15000);
        Manager man2 = new Manager(201, "Vikram Sharma ", "Tech Lead", 15000);

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();

        System.out.println("Engineering Payroll: " + engDirectory.getSalary());
        System.out.println("Management Payroll: " + accDirectory.getSalary());
        System.out.println("Company Payroll: " + directory.getSalary());
    }
}
