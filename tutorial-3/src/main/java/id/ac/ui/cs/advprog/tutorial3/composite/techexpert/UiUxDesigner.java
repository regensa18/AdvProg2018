package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class UiUxDesigner extends Employees {
    public UiUxDesigner(String name, double salary) {
        this.name = name;
        if (salary < 90000) {
            throw new IllegalArgumentException("Invalid salary " + salary);
        }
        this.salary = salary;
        this.role = "UI/UX Designer";
    }

    public double getSalary() {
        return salary;
    }

}
