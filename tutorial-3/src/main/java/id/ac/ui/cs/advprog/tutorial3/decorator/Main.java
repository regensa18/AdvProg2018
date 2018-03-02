package id.ac.ui.cs.advprog.tutorial3.decorator;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.BreadProducer;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.FillingDecorator;

public class Main {

    public static void main(String[] args){
        Food thickBunBurgerSpecial = new BreadProducer.THICK_BUN.createBreadToBeFilled();
        thickBunBurgerSpecial.cost();

        thickBunBurgerSpecial = FillingDecorator.BEEF_MEAT.addFillingToBread(
                thickBunBurgerSpecial);
        thickBunBurgerSpecial.cost();

        thickBunBurgerSpecial = FillingDecorator.CHEESE.addFillingToBread(
                thickBunBurgerSpecial);
        thickBunBurgerSpecial.cost();

        thickBunBurgerSpecial = FillingDecorator.CUCUMBER.addFillingToBread(
                thickBunBurgerSpecial);
        thickBunBurgerSpecial.cost();

        system.print();

        thickBunBurgerSpecial = FillingDecorator.LETTUCE.addFillingToBread(
                thickBunBurgerSpecial);
        thickBunBurgerSpecial.cost();

        thickBunBurgerSpecial = FillingDecorator.CHILI_SAUCE.addFillingToBread(
                thickBunBurgerSpecial);
        thickBunBurgerSpecial.cost();

        Food thinBunBurgerVegetarian = new BreadProducer.THIN_BUN.createBreadToBeFilled();
        thinBunBurgerVegetarian.cost();

        thinBunBurgerVegetarian = FillingDecorator.TOMATO.addFillingToBread(
                thinBunBurgerVegetarian);
        thinBunBurgerVegetarian.cost();

        thinBunBurgerVegetarian = FillingDecorator.LETTUCE.addFillingToBread(
                thinBunBurgerVegetarian);
        thinBunBurgerVegetarian.cost();

        thinBunBurgerVegetarian = FillingDecorator.CUCUMBER.addFillingToBread(
                thinBunBurgerVegetarian);
        thinBunBurgerVegetarian.cost();

        Food doubleBeefChickenDoubleSauceSandwich = new
                BreadProducer.CRUSTY_SANDWICH.createBreadToBeFilled();
        doubleBeefChickenDoubleSauceSandwich.cost();

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.BEEF_MEAT.addFillingToBread(
                        doubleBeefChickenDoubleSauceSandwich);
        doubleBeefChickenDoubleSauceSandwich.cost();

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.CHICKEN_MEAT.addFillingToBread(
                        doubleBeefChickenDoubleSauceSandwich);
        doubleBeefChickenDoubleSauceSandwich.cost();

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.CHILI_SAUCE.addFillingToBread(
                        doubleBeefChickenDoubleSauceSandwich);
        doubleBeefChickenDoubleSauceSandwich.cost();

        doubleBeefChickenDoubleSauceSandwich =
                FillingDecorator.TOMATO_SAUCE.addFillingToBread(
                        doubleBeefChickenDoubleSauceSandwich);
        doubleBeefChickenDoubleSauceSandwich.cost();

        Food noCrustAllFillingSandwich = new BreadProducer.NO_CRUST_SANDWICH
                .createBreadToBeFilled();

        noCrustAllFillingSandwich = FillingDecorator.BEEF_MEAT.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHEESE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHICKEN_MEAT.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CHILI_SAUCE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.CUCUMBER.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.LETTUCE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.TOMATO.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich = FillingDecorator.TOMATO_SAUCE.addFillingToBread(
                noCrustAllFillingSandwich);

        noCrustAllFillingSandwich.cost();




    }
}