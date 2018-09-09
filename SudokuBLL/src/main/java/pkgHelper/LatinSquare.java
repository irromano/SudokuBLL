package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public boolean containsZero() {
		boolean containsZero = false;

		if (LatinSquare == null)
			return false;

		for (int iCol = 0; iCol < LatinSquare.length; iCol++) {
			for (int iRow = 0; iRow < LatinSquare.length; iRow++) {
				if (LatinSquare[iCol][iRow] == 0) {
					containsZero = true;
				}
			}
		}
		return containsZero;

	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;

		if (arr == null)
			return false;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}

		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;

		if (arr == null)
			return false;

		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}

		return doesElementExist;
	}
}
