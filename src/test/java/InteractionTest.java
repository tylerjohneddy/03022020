import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.tutorial.tyler.Interaction;

public class InteractionTest {
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("Hi friend", interaction.greeting());
	}
	@Test
	public void insultTest() {
		Interaction interaction = new Interaction();
		assertEquals("Is trash", interaction.insult());
	}


}
