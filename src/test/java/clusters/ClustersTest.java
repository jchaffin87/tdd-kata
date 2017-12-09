package clusters;

import org.junit.Assert;
import org.junit.Test;

public class ClustersTest {

	@Test
	public void shouldReturnZero() {
		Clusters underTest = new Clusters();
		int[] testArray = { 1, 2, 3, 4, 5 };//
		int response = underTest.say(testArray);
		Assert.assertEquals(0, response);

	}

	@Test
	public void shouldReturnOne() {
		Clusters underTest = new Clusters();
		int[] testArray = { 1, 2, 2, 4, 5 };//
		int response = underTest.say(testArray);
		Assert.assertEquals(1, response);

	}

	@Test
	public void shouldReturnTwoForTwoClustersOfTwo() {
		Clusters underTest = new Clusters();
		int[] testArray = { 1, 2, 2, 4, 5, 5 };//
		int response = underTest.say(testArray);
		Assert.assertEquals(2, response);

	}

	@Test
	public void shouldReturnTwoForTwoClustersOfThree() {
		Clusters underTest = new Clusters();
		int[] testArray = { 1, 2, 2, 2, 3, 4, 5, 5, 5 };//
		int response = underTest.say(testArray);
		Assert.assertEquals(2, response);

	}

	@Test
	public void shouldReturnThreeForOneClusterOfThreeAndTwoClustersOfTwo() {
		Clusters underTest = new Clusters();
		int[] testArray = { 1, 2, 2, 2, 3, 4, 4, 5, 5 };//
		int response = underTest.say(testArray);
		Assert.assertEquals(3, response);

	}

}
