package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Cucumber extends FillingDecorator {
    Food food;

    public Cucumber(Food food) {
        //TODO Implement
        this.food = food;
    }

    @Override
    public String getDescription() {
        //TODO Implement
        return food.getDescription() + ", adding cucumber";
    }

    @Override
    public double cost() {
        //TODO Implement
        return 0.4 + food.cost();
    }
}