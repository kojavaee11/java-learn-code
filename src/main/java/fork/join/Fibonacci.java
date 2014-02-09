package fork.join;

import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {

	private static final long serialVersionUID = -6123795430316981353L;
	
	final int n;
	
	public Fibonacci(int n) {
		this.n = n;
	}
	
	protected int compute(int small) {
		final int[] results = {1,1,2,3,5,8,13,21,34,55,89};
		return results[small];
	}

	@Override
	protected Integer compute() {
		if(n <= 10) {
			return compute(n);
		}
		
		Fibonacci f1 = new Fibonacci(n - 1);
		Fibonacci f2 = new Fibonacci(n - 2);
		
		f1.fork();
		f2.fork();
		
		return f1.join()  + f2.join();
	}
	
}
