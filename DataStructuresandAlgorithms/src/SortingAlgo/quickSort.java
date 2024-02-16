package SortingAlgo;

public class quickSort {
	
	public static void sort(int[] arr, int start, int end) {
		
		if (start < end) {
			 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pivot = partition(arr, start, end);
 
            // Separately sort elements before
            // partition and after partition
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
	}
	
	// A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
	
	public static void main(String[] args) {
		
		int[] arr = {7, 8, 3, 1, 2};
		int n = arr.length;
		
		sort(arr, 0, n-1);
		
		for(int val: arr) {
			System.out.print(val+" ");
		}
		
	}
}
 
    
