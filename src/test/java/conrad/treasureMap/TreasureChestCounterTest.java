package conrad.treasureMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreasureChestCounterTest {
	@Test
	public void testTreasureChestNearby(){
	Grid g = new Grid(4, 5);
			g.addTreasureChest(new TreasureChest("1"), 0, 0);
				g.addTreasureChest(new TreasureChest("2"), 1, 2);
			TreasureChestManager v = new TreasureChestManager();
			v.displayTreasureChestNearby(g);
			//TODO need to put in array to check the records
			assertEquals(1,g.getRows());
	}
	

}
