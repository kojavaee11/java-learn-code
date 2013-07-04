package design.observer;

public class GameRoom implements IGameDisplay, IGameListener {
	private int firstBidPosition;
	private IGameObserver observer;
	
	public GameRoom(IGameObserver observer) {
		this.observer = observer;
		observer.registerObserver(this);
	}
	
	public void onNewGame(int firstBidPosition) {
		this.firstBidPosition = firstBidPosition;
		display();
	}
	
	public void display() {
		System.out.println("new game current position : " + this.firstBidPosition);
	}

	
	
}
