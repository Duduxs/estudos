package codewars.java;

public class FindTheParityOutlier {

	static int find(int[] integers) {

		int oddNumber = -1, evenNumber = -1, onlyOdd = 0;

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				oddNumber = integers[i];
				onlyOdd++;
			} else
				evenNumber = integers[i];
		}
		return onlyOdd == 1 ? oddNumber : evenNumber;
	}

	public static void main(String[] args) {
		int value[] = { 160, 3, 1719, 19, 11, 13, -21 };
		System.out.println(FindTheParityOutlier.find(value));
	}
}
