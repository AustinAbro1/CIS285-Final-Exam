
public class SelectionSort {
	private int temp;

	public void selectionSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
	}
}
				
