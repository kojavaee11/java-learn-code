package design.adapter;

import java.util.Random;

/**
 * @Description: code come from java design-patterns
 */
public class DuckAdapter implements Turkey {
	Duck duck;
	Random randmon;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		randmon = new Random();
	}
	
	/** 
	 * @see design.adapter.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		duck.quack();
	}

	/** 
	 * @see design.adapter.Duck#fly()
	 */
	@Override
	public void fly() {
		if(randmon.nextInt(5) == 0) {
			duck.fly();
		}
	}
	
}
