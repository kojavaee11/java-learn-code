package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest {
	public static void main(String[] args) {
		Hall.add(new Person("test","1","122"));
		Hall.add(new Person("test1","1","1221"));
		Hall.add(new Person("test2","1","1222"));
		Hall.add(new Person("test3","1","1223"));
		Hall.add(new Person("test4","1","1224"));
		Hall.add(new Person("test5","1","1225"));
		Runnable update = new RunnableUpdatePerson();
		Runnable read = new RunnableReadPersons();
		Runnable remove = new RunnableRemovePersons();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(read);
		//exec.execute(update);
		exec.execute(remove);
		exec.shutdown();
	}
}
