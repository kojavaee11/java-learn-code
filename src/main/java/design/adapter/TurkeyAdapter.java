package design.adapter;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author     : lzh laizhihuan@basecity.com
 * @Date       : 2013-4-12 上午9:36:19
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	/** 
	 * @see design.adapter.Duck#quack()
	 */
	public void quack() {
		turkey.gobble();
	}

	/** 
	 * @see design.adapter.Duck#fly()
	 */
	public void fly() {
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}

}
