
class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		
		for (int i = 0; i < n-1; i++)
		{
			
			int min = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;

			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}


	void display(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}


	public static void main(String args[])
	{
		SelectionSort s1 = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		s1.sort(arr);
		System.out.println("Sorted array");
		s1.display(arr);
	}
}

