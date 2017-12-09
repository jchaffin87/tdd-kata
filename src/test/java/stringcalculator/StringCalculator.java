package stringcalculator;

public class StringCalculator {

	int result;

	public int say(String input) {
		if (input.equals("")) {
			result = 0;
		}
		if (!input.contains(",")) {
			result = Integer.parseInt(input);
		}
		if (input.contains(",")) {
			String[] nums = input.split(",");
		}

		return result;
	}

}
