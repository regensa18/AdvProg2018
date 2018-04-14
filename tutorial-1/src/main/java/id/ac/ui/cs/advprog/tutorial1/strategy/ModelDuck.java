package id.ac.ui.cs.advprog.tutorial1.strategy;

public class ModelDuck extends Duck{
    // TODO Complete me!
	public ModelDuck(){
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
	
	public void display(){
		System.out.println("this is model duck!");
	}
}
