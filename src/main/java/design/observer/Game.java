package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Game implements IGameObserver {
	private List<IGameListener> observers;
	private int firstBidPosition;
	
	public Game() {
		observers = new ArrayList<IGameListener>();
	}
	
	public void registerObserver(IGameListener game) {
		observers.add(game);
	}

	public void removeObserver(IGameListener game) {
		int index = observers.indexOf(game);
		if(index >= 0) observers.remove(index);
	}

	public void notifyListener() {
		for (IGameListener observer : observers) {
			observer.onNewGame(firstBidPosition);
		}
	}

}
