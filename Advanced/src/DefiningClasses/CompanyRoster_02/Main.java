package DefiningClasses.CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < lines; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            int length = data.length;
            //Peter 120.00 Dev Development peter@abv.bg 28
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String departmentName = data[3];

            Employee employee = null;
            Department department = new Department(departmentName);

            switch (length) {
                case 4:
                    employee = new Employee(name, salary, position, departmentName);
                    break;
                case 5:
                    if (data[4].contains("@")) {
                        String email = data[4];
                        employee = new Employee(name, salary, position, departmentName, email);
                    } else {
                        int age = Integer.parseInt(data[4]);
                        employee = new Employee(name, salary, position, departmentName, age);
                    }
                    break;
                case 6:
                    String email = data[4];
                    int age = Integer.parseInt(data[5]);
                    employee = new Employee(name, salary, position, departmentName, email, age);
                    break;
            }
            departmentMap.putIfAbsent(departmentName, department);
            departmentMap.get(departmentName).getEmployees().add(employee);
        }

        Department departmentWithHighestSalary = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(department -> department.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + departmentWithHighestSalary.getName());
        departmentWithHighestSalary.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(Employee -> System.out.println(Employee.toString()));
    }
}
