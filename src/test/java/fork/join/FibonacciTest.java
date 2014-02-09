package fork.join;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void testFibonacci() throws InterruptedException, ExecutionException {
	    ForkJoinTask<Integer> fjt = new Fibonacci(45);
	    ForkJoinPool fjpool = new ForkJoinPool();
	    Future<Integer> result = fjpool.submit(fjt);

	    // do something
	    System.out.println(result.get());
	}
	
}
