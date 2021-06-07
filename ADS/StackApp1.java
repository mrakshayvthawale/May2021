import java.util.*;

class StackDemo
{
	private int size;
	private int S[];
	private int top;
	
	public StackDemo(int s)
	{
		size =s;
		S = new int[size];
		top=-1;
	}
	
	public void push(int j)
	{
		S[++top]=j;
	}
	
	public int pop()
	{
		return S[top--];
	}
	public int peek()
	{
		return S[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top==size-1);
	}
	public void display()
	{
		for(int i=0;i<size;i++)
			System.out.print(S[i]+" ");
	}
	
}
public class StackApp1 {
public static void main(String args[])
{
	
	StackDemo s=new StackDemo(5);
	Scanner in= new Scanner(System.in);
	
	 do
		{System.out.println("\n******** MENU *******");
		 System.out.println("\n1.PUSH");
		 System.out.println("\n2.POP");
		 System.out.println("\n3.PEEK");
		 System.out.println("\n4 IS EMPTY");
		 System.out.println("\n5.EXIT");
		 System.out.println("\n enter ur choice : ");
		 switch(in.nextInt())
			{
			 case 1: 
				 System.out.println("\nenter the value ");
				 s.push(in.nextInt());
				 break;
			 case 2: 
				System.out.println("\n popped element : "+ s.pop());
				 break;
			 
			case 3: 
				System.out.println("\n top element : "+ s.peek());
				 break;
			 case 4: System.out.println("\n is empty : "+ s.isEmpty());
					 break;
			 case 5: System.exit(0);
					 break;
			 default: System.out.println("\n Wrong Choice!");
					  break;
			}
		 System.out.println("\n do u want to cont... ");
		}while(in.nextInt()==1);
}
}
