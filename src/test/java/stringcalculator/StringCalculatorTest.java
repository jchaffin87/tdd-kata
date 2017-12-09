package stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void shouldReturnZeroForEmptyString() {
		StringCalculator underTest = new StringCalculator();
		String input = "";
		int response = underTest.say(input);
		Assert.assertEquals(0, response);

	}

	@Test
	public void shouldReturnStringContentsWhenOnlyOneNumIsEntered() {
		StringCalculator underTest = new StringCalculator();
		String input = "42";
		int response = underTest.say(input);
		Assert.assertEquals(42, response);
	}

	@Test
	public void shouldReturnTenWhenTwoFivesAreEnteredDelimitedByCommas() {
		StringCalculator underTest = new StringCalculator();
		String input = "5,5";
		int response = underTest.say(input);
		Assert.assertEquals(10, response);
	}

}
