//Factorial
class Recursion2
{
	static int fact(int n)
	{
		//base condition
		if(n<=1)
			return 1;
		//recusion 2!=2*1 3!= 3*2!
		else
			return n*fact(n-1);
		
	}
public static void main(String [] arg)
{
	
	System.out.println(fact(5));

}
	
}
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