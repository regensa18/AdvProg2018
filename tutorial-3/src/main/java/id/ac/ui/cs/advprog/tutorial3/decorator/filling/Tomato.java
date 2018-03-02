package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class Tomato extends FillingDecorator {
    Food food;

    public Tomato(Food food) {
        //TODO Implement
        this.food = food;
    }

    @Override
    public String getDescription() {
        //TODO Implement
        return food.getDescription() + ", adding tomato";
    }

    @Override
    public double cost() {
        //TODO Implement
        return 0.5 + food.cost();
    }
}