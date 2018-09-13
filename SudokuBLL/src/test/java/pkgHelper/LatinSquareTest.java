package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZero_test1() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,0}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertTrue(lq.ContainsZero());
		
	}
	@Test
	public void ContainsZero_test2() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,7}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.ContainsZero());
		
	}
	@Test
	public void ContainsZero_test3() {
		
		int [][] arr = null;
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.ContainsZero());
		
	}
	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test2() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,2,3,4,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test4() {
		
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
		
	}
	@Test
	public void hasDuplicates_test5() {
		
		int [] arr = {10, 400, 0, 2};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	@Test
	public void doesElementExist_test1() {
		int [] arr = {1, 2, 3, 4, 5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void doesElementExist_test2() {
		int [] arr = {1, 2, 3, 4, 5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void doesElementExist_test3() {
		int [] arr = null;
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void hasAllValues_test1() {
		int[] arr1 = {1, 2, 3, 4, 0};
		int[] arr2 = {0, 3, 4, 2, 1};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void hasAllValues_test2() {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {0, 3, 4, 2, 1};
		
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasAllValues(arr1, arr2));
	}
	@Test
	public void getColumn_test1() {
		int [][] arr = {{1,2,3}, {5,3,7}, {10,11,0}};
		int[] arrCol = {2,3,11};
		LatinSquare lq = new LatinSquare(arr);
		assertTrue(Arrays.equals(arrCol, lq.getColumn(1)));
	}
	@Test
	public void getColumn_test4() {
		int [][] arr = {{1,2,3}, {5,3,7}, {10,11,0}};
		int[] arrCol = {3,7,0};
		LatinSquare lq = new LatinSquare(arr);
		assertTrue(Arrays.equals(arrCol, lq.getColumn(2)));
	}
	@Test
	public void getColumn_test2() {
		int [][] arr = {{1,2,3}, {5,3,7}, {10,11,0}};
		int[] arrCol = {2,6,11};
		LatinSquare lq = new LatinSquare(arr);
		assertFalse(Arrays.equals(arrCol, lq.getColumn(1)));
	}
	@Test
	public void getColumn_test3() {
		int [][] arr = {{1,2,3}, {5,3,7}, {10,11,0}};
		int[] arrCol = {2,11,3};
		LatinSquare lq = new LatinSquare(arr);
		assertFalse(Arrays.equals(arrCol, lq.getColumn(1)));
	}
	@Test
	public void getRow_test1() {
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,0}};
		LatinSquare lq = new LatinSquare(arr);
		assertArrayEquals(new int[] {5,6,7}, lq.getRow(1));
	}
	@Test
	public void getRow_test2() {
		int [][] arr = {{1,2,3}, {5,3,7}, {10,11,0}};
		int[] arrRow = {5,3,11};
		LatinSquare lq = new LatinSquare(arr);
		assertFalse(Arrays.equals(arrRow, lq.getRow(1)));
	}
	@Test
	public void isLatinSquare_test1() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,0}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test2() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,4}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test3() {
		int [][] arr = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertTrue(lq.isLatinSquare());
	}
	@Test
	public void isLatinSquare_test4() {
		int [][] arr = {{1,2,2}, {2,2,1}, {2,1,2}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.isLatinSquare());
	}
}
