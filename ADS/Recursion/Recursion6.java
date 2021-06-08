
//

class Recursion6
{
	static void toh(int n,char s,char inter,char end)
	{
		if(n==1)
			System.out.println("Disk from "+s+ "to "+end);
		else
		{
			toh(n-1,s,end,inter);
			System.out.println("Disk from "+s+ "to "+end);
			toh(n-1,inter, s,end);
		}
	}
	
	
public static void main(String [] arg)
{
	int n=3;
	toh(n,'A','B','C');
	
	
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