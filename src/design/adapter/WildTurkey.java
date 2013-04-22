package design.adapter;

/**
 * @Description: code come from java design-patterns
 */
public class WildTurkey implements Turkey {

	/** 
	 * @see design.adapter.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	/** 
	 * @see design.adapter.Turkey#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
	
}
