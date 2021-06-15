


class MergeSort
{
	//Divide
	void merge(int arr[], int l, int m, int r)
	{
		\\size of sub array
		int n1 = m - l + 1;
		int n2 = r - m;

		\\L and R array declaration
		int L[] = new int[n1];
		int R[] = new int[n2];

		\\Left array
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		\\Right array
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		

		
		int i = 0, j = 0;

		// Merge logic
		int k = l;
		while (i < n1 && j < n2) {
			\\insert in left
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			\\insert in right
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		//L remaining
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		//R remaining
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	//Combine
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
		
			int m =l+ (r-l)/2;

			\\call for left subarray
			sort(arr, l, m);
			
			\\call for right subarray
			sort(arr, m + 1, r);

			
			merge(arr, l, m, r);
		}
	}

	
	void display(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		

		MergeSort m1 = new MergeSort();
		
		System.out.println("Given Array");
		m1.display(arr);
		
		m1.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		m1.display(arr);
	}
}


