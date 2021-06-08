
//

class Recursion5
{
	static String R1(int n)
	{
		if(n==1)
			return "int";
		
		return "gcd(int,"+R1(n-1)+")";
	}
	
public static void main(String [] arg)
{
	int n=3;
	System.out.println(R1(n));
	
	
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