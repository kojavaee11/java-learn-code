package design.observer;

public class GameRoomTest {
	
	public static void main(String[] args) {
		Game game = new Game();
		GameRoom room = new GameRoom(game);
		
		room.onNewGame(0);
		room.onNewGame(1);
		room.onNewGame(2);
	}
	
}
