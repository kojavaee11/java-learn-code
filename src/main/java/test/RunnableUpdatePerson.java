package test;

public class RunnableUpdatePerson implements Runnable {
	@Override
	public void run() {
		try {
			Person person = Hall.get("test2");
			person.setSex("boy");
			System.out.println(person);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
