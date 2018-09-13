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

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i])

				return false;

		}

		return true;

	}

	public boolean isLatinSquare() {
		
		if (ContainsZero())
			return false;

		for (int i = 0; i < LatinSquare.length; i++) {

			if (hasDuplicates(this.getColumn(i))) {
				return false;
			}
		}
		
		for (int i = 0; i < LatinSquare.length; i++) {

			if (hasDuplicates(this.getRow(i))) {
				return false;
			}

		}
		int[] arrRow = this.getRow(0);
		int[] arrCol = this.getColumn(0);
		for (int j = 0; j < LatinSquare.length; j++) {

			if (hasAllValues(arrRow, LatinSquare[j]) == false)
				return false;
		}
// checks to see if arrCol matches getColumn of all other columns
// loops for every column in the square
		
		for (int k = 1; k < LatinSquare.length; k++) {
				if (hasAllValues(this.getColumn(0), this.getColumn(k)) == false)
					return false;

		}
		return true;
	}

		
}
