import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortExamTest {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		testMixed();
	}
	
	void testMixed() {
		SelectionSort sort = new SelectionSort();
		int[] item = new int[5];
		item[0] = 3;
		item[1] = -7;
		item[2] = 9;
		item[3] = -1;
		item[4] = 2;
		
		sort.selectionSort(item);
		int[] sorted = item;
		
		int[] sortedArray = new int[5];
		
		sortedArray[0] = -9;
		sortedArray[1] = -1;
		sortedArray[2] = 2;
		sortedArray[3] = 3;
		sortedArray[4] = 9;
		
		assertArrayEquals(sortedArray,sorted);
	}
	
	void testNegative() {
		SelectionSort sort = new SelectionSort();
		int[] item = new int[5];
		item[0] = -3;
		item[1] = -7;
		item[2] = -9;
		item[3] = -1;
		item[4] = -2;
		
		sort.selectionSort(item);
		int[] sorted = item;
		
		int[] sortedArray = new int[5];
		
		sortedArray[0] = -9;
		sortedArray[1] = -7;
		sortedArray[2] = -3;
		sortedArray[3] = -2;
		sortedArray[4] = -1;
		
		assertArrayEquals(sortedArray,sorted);
	}
	
	void testPositive() {
		SelectionSort sort = new SelectionSort();
		int[] item = new int[5];
		item[0] = 4;
		item[1] = 2;
		item[2] = 8;
		item[3] = 9;
		item[4] = 7;
		
		sort.selectionSort(item);
		int[] sorted = item;
		
		
		int[] sortedArray = new int[5];
		
		sortedArray[0] = 2;
		sortedArray[1] = 4;
		sortedArray[2] = 7;
		sortedArray[3] = 8;
		sortedArray[4] = 9;
		
		assertArrayEquals(sortedArray,sorted);
		
	}
	
	
	
	

}
