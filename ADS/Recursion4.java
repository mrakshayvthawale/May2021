//Fibonacci Series
//1 1 2 3 5
//

class Recursion4
{
	static int fibonaci(int n)
	{
		if(n <= 1)
			return n;
		
		return fibonaci(n-1)+fibonaci(n-2);
	}
	
	
public static void main(String [] arg)
{
	int k=50;
	System.out.println("Fibonacci:");
	for(int i=1; i<=k;i++)
		System.out.print(fibonaci(i)+" ");

}
	
}








//-----------------------------------------------
/*
// Direct calling 
void abc()
{
	abc();
}

//indirect calling 
void abc()
{
	xyz();
}

void xyz()
{
	abc();
}
*/