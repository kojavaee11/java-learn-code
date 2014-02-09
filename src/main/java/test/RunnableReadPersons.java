package test;

import java.util.Iterator;

public class RunnableReadPersons implements Runnable {

	@Override
	public void run() {
		try {
			Iterator<Person> iter = Hall.getPersons().iterator();
			while (iter.hasNext()) {
				Person p = iter.next();
				Thread.sleep(9);
				System.out.println("person + " + p);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
