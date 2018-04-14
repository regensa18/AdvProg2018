package id.ac.ui.cs.advprog.tutorial1.strategy;

public class MallardDuck extends Duck {
    // TODO Complete me!
	public MallardDuck(){
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	public void display(){
		System.out.println("this is mallard duck!");
	}
}
