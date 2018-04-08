package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class Ceo extends Employees {
    public Ceo(String name, double salary) throws IllegalArgumentException {
        //TODO Implement
        this.name = name;
        if (salary < 200000) {
            throw new IllegalArgumentException("Invalid salary " + salary);
        }
        this.salary = salary;
        this.role = "CEO";
    }
    @Override
    public double getSalary() {
        //TODO Implement
        return salary;
    }
}
