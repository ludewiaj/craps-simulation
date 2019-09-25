import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OverridingStaticTest
{
	
private final Die die1 = new Die();
private final CrookedDie1 c_die = new CrookedDie1();
private final Die die2 = new CrookedDie1();

	@Test
	void dieMethodTest()
	{
		assertEquals("Die.testStatic()", die1.testStatic());
	}
	
	@Test
	void CrookedMethodTest()
	{
		assertEquals("CrookedDie1.testStatic()", c_die.testStatic());
	}
	
	@Test
	void overrideTest()
	{
		assertEquals("Die.testStatic()", die2.testStatic());
	}

}
