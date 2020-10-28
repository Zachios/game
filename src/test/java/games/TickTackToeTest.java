package games;

import org.junit.Assert;
import org.junit.Test;

public class TickTackToeTest {

	@Test
	public void create_whenCreatingGame_theReturnInstanceOfTickTackToe() {
		Game game = new TickTackToe();
		Assert.assertTrue("Unexpected game type returned", game instanceof TickTackToe);
	}

}
