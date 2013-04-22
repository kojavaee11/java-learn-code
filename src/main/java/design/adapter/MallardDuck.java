package design.adapter;

/**
 * @Description: code come from java design-patterns
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}
	
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
	
}
