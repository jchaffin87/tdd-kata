package clusters;

public class Clusters {

	public int say(int[] testArray) {
		int clusterCount = 0;

		for (int i = 0; i < testArray.length - 1; i++) {
			if (nextIsEqual(testArray, i) && lastIsNotEqual(testArray, i)) {
				clusterCount++;
			}
		}
		return clusterCount;

	}

	private boolean lastIsNotEqual(int[] testArray, int i) {
		return testArray[i] != testArray[i - 1];
	}

	private boolean nextIsEqual(int[] testArray, int i) {
		return testArray[i] == testArray[i + 1];
	}

}
