package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void containsZero_test1() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,0}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertTrue(lq.containsZero());
		
	}
	@Test
	public void containsZero_test2() {
		
		int [][] arr = {{1,2,3}, {5,6,7}, {10,11,7}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.containsZero());
		
	}
	@Test
	public void containsZero_test3() {
		
		int [][] arr = null;
		LatinSquare lq = new LatinSquare(arr);
		
		assertFalse(lq.containsZero());
		
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


}
