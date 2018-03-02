package id.ac.ui.cs.advprog.tutorial3.decorator.filling;

import id.ac.ui.cs.advprog.tutorial3.decorator.Food;

public class ChickenMeat extends FillingDecorator {
    Food food;

    public ChickenMeat(Food food) {
        //TODO Implement
        this.food = food;
    }

    @Override
    public String getDescription() {
        //TODO Implement
        return food.getDescription() + ", adding chicken meat";
    }

    @Override
    public double cost() {
        //TODO Implement
        return 4.5 + food.cost();
    }
}