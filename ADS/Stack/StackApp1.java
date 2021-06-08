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

class StackApp1
{
	public static void reverse(StringBuffer str)
	{
		int n=str.length();
		Stack s1 = new Stack(n);
		int i;
		for(i=0;i<n;i++)
			s1.push(str.charAt(i));
		
		for(i=0;i<n;i++)
		{
			char ch=(char)s1.pop();
			str.setCharAt(i,ch);
		}
		
	}
	public static void main(String args[])
	{
	
		StringBuffer s = new StringBuffer("MAHESH AND RAHUL");
		reverse(s);
		
		System.out.println("Reverse String   :  "+s);
		
		
		
	}
	
}