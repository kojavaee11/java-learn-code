package test;

public class RunnableRemovePersons implements Runnable {

	@Override
	public void run() {
		Hall.getPersons().remove(2);
	}

}
