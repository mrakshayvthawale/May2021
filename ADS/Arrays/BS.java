class BS
{
static int bsearch(int a1[], int x, int l, int h)
{
	if (h >= l) {
			int mid = l + (h - l) / 2;
		if (a1[mid] == x)
			return mid;
		if (a1[mid] > x)
		return bsearch(a1, x, l, mid - 1);//int
		return bsearch(a1, x, mid + 1, h);//int
	}
	return -1;

}

public static void main(String args[])
{
	int a1[]={1,2,3,4,5};//5===> 0-4
	int  x =5;
	int n = a1.length;
	int res = bsearch(a1,x,0,n-1);
	if( res == -1)
		System.out.print("Not found");
	else
		System.out.println("Found");
	
}
}
