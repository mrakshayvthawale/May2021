class Stack
{
	private int S[];
	private int size;
	private int top;
	
	public Stack(int s)
	{
		size = s;
		S = new int[size];
		top =-1;
	}
	
	public void push(int j)
	{
		S[++top] = j;
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
		 return (top == -1);//Underflow
	 }
	 
	 public boolean isFull()
	 {
		 return (top == size-1);//Overflow
	 }
	 
	 public void display()
	 {
		 for(int i=0;i<size;i++)
			 System.out.println(S[i]);
	 }
	 
	
}

class StackApp
{
	public static void main(String args[])
	{
		Stack s1 = new Stack(5);
		s1.push(10);//10
		s1.display();
		s1.push(20);//10 20
		s1.push(30);//10 20 30
		s1.display();
		s1.pop();//10 20
		System.out.println(s1.pop());//10
		//s1.display();
		
		do{
			1.Push
			x==input
			switch(x)
			{
				
				case 1: s1.push()
				..
			}
			
		}
		
		
		
		
	}
	
}