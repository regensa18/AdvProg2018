package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Cheese extends FillingDecorator {
    Food food;

    public Cheese(Food food) {
        //TODO Implement
        this.food = food;
    }

    @Override
    public String getDescription() {
        //TODO Implement
        return food.getDescription() + ", adding cheese";
    }

    @Override
    public double cost() {
        //TODO Implement
        return 2.00 + food.cost();
    }
}