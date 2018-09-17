package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	// Attributes
	private int[][] LatinSquare;

	// Constructors
	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	// Methods
	public boolean ContainsZero() {
		boolean containsZero = false;

		if (LatinSquare == null)
			return false;

		for (int iRow = 0; iRow < LatinSquare.length; iRow++) {
			for (int iCol = 0; iCol < LatinSquare.length; iCol++) {
				if (LatinSquare[iRow][iCol] == 0) {
					containsZero = true;
				}
			}
		}
		return containsZero;

	}

	public int[][] getLatinSquare() {
		return this.LatinSquare;
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
			}
		}

		return hasDuplicates;
	}

	public int[] getRow(int iRow) {

		return LatinSquare[iRow];

	}

	public int[] getColumn(int iCol) {

		int[] column = new int[LatinSquare.length];

		for (int i = 0; i < LatinSquare.length; i++) {

			column[i] = LatinSquare[i][iCol];

		}

		return column;
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

	public boolean hasAllValues(int[] arr1, int[] arr2) {

		if (arr1 == null)
			return false;

		if (arr2 == null)
			return false;

		Arrays.sort(arr1);

		Arrays.sort(arr2);

		for (int valInd = 0; valInd < arr1.length; valInd++) {

			if (arr1[valInd] != arr2[valInd])

				return false;

		}

		return true;

	}

	public boolean isLatinSquare() {
		if (LatinSquare == null)
			return false;
		
		for (int colInd = 1; colInd < LatinSquare.length; colInd++) {
			if (hasAllValues(this.getColumn(0), this.getColumn(colInd)) == false) {
				return false;
			} else if (hasDuplicates(this.getColumn(colInd))) {
				return false;
			}
		}

		for (int rowInd = 1; rowInd < LatinSquare.length; rowInd++) {
			if (hasAllValues(this.getRow(0), this.getRow(rowInd)) == false) {
				return false;
			} else if (hasDuplicates(this.getRow(rowInd))) {
				return false;
			}

		}
		if (this.ContainsZero()) {
			return false;
		}
		return true;
	}
}
