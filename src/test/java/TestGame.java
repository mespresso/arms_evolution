package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.Game;
import main.java.Player;
public class TestGame {
	
	@Test
	public void test() {
		Player player1 = new Player("张三", 100, 10);
		Player player2 = new Player("李四", 100, 10);
		Game testCase = new Game(player1,player2);
		
		assertEquals("李四被打败了", testCase.play());
	}
}
