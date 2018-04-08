package id.ac.ui.cs.advprog.tutorial3.decorator;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.BreadProducer;
import id.ac.ui.cs.advprog.tutorial3.decorator.bread.ThickBunBurger;
import id.ac.ui.cs.advprog.tutorial3.decorator.bread.ThinBunBurger;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.Cheese;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.FillingDecorator;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.Lettuce;

public class Main {

    public static void main(String[] args){
        ThinBunBurger thinBunBurger = new ThinBunBurger();
        Cheese cheese = new Cheese(thinBunBurger);
        System.out.println(thinBunBurger.getDescription());
        System.out.println("Harga Roti: " + thinBunBurger.cost());
        System.out.println(cheese.getDescription());
        System.out.println("Harga Total: " + cheese.cost());
        System.out.println("=============================================================");
        ThickBunBurger thickBunBurger = new ThickBunBurger();
        Lettuce lettuce = new Lettuce(thickBunBurger);
        System.out.println(thickBunBurger.getDescription());
        System.out.println("Harga Roti: " + thickBunBurger.cost());
        System.out.println(lettuce.getDescription());
        System.out.println("Harga Total: " + lettuce.cost());
    }
}