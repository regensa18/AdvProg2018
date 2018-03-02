package id.ac.ui.cs.advprog.tutorial3.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    protected List<Employees> employeesList;

    public Company() {
        employeesList = new ArrayList<Employees>();
    }

    public Company(List<Employees> employeesList) {
        Collections.copy(this.employeesList, employeesList);
    }

    public void addEmployee(Employees employees) {
        //TODO Implement
        employeesList.add(employees);
    }

    public double getNetSalaries() {
        //TODO Implement
        double salary = 0;
        for (int i = 0; i < employeesList.size(); i++) {
            salary += employeesList.get(i).getSalary();
        }
        return salary;
    }

    public List<Employees> getAllEmployees() {
        //TODO Implement
        return employeesList;
    }

}
