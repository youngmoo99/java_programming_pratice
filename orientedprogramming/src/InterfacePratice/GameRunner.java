package InterfacePratice;

public class GameRunner {

	public static void main(String[] args) {
		// 다형성!!

		// MarioGame game = new MarioGame();
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
