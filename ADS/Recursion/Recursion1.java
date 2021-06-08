
class Recursion1
{
	static int i=0;
	static void show()
	{	i++;
		if(i<=3)//base condition
		{
		System.out.println("Hi Girls !!!");
		show();

		}
	}
public static void main(String [] arg)
{
	
	System.out.println("Hi ....");
	show();
}
	
}