import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.printf("Salary: $", salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Officer officer = new Officer();
        System.out.println("Enter Officer details:");
        System.out.print("Name: ");
        officer.name = scanner.nextLine();
        System.out.print("Age: ");
        officer.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        officer.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        officer.address = scanner.nextLine();
        System.out.print("Salary: ");
        officer.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Specialization: ");
        officer.specialization = scanner.nextLine();

        Manager manager = new Manager();
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        manager.name = scanner.nextLine();
        System.out.print("Age: ");
        manager.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        manager.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        manager.address = scanner.nextLine();
        System.out.print("Salary: ");
        manager.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        manager.department = scanner.nextLine();

        System.out.println("\nOfficer Details:");
        printEmployeeDetails(officer);
        System.out.println("Specialization: " + officer.specialization);

        System.out.println("\nManager Details:");
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.department);
    }

    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
    }
}
