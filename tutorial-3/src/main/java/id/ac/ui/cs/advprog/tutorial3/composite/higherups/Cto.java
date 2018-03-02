package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class Cto extends Employees {
    public Cto(String name, double salary) {
        this.name = name;
        if (salary < 100000) {
            throw new IllegalArgumentException("Invalid salary " + salary);
        }
        this.salary = salary;
        this.role = "CTO";
    }

    public double getSalary() {
        return salary;
    }
}
