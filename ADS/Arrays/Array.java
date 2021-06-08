class Array
{
	public static void main(String args[])
	{
		int a1[] = new int[10];
		int n=10;
		int j=0;
		
		a1[0]=22;
		a1[1]=44;
		a1[2]=66;
		a1[3]=77;
		a1[4]=88;
		a1[5]=22;
		a1[6]=55;
		a1[7]=99;
		a1[8]=00;
		a1[9]=11;
		//------Display 1--------------------------
		for(int i:a1)  
			System.out.print(i+" ");  
		
		System.out.println("========================");
		
		
		//------Search Found--------------------------
		int key =63;//66
		for(j=0;j<n;j++)
			if(a1[j] == key)
				break;
		if(j == n)
			System.out.println("Not found...");
		else
			System.out.println("Found...");
			
		//------Delete--------------------------
		 key =22;//66
		for(j=0;j<n;j++)
			if(a1[j] == key)
				break;
			
		for(int k=j;k<n-1;k++)
			a1[k]=a1[k+1];
		n--;
		
		//------Display 2--------------------------
		for(j=0;j<n;j++)
			System.out.print(a1[j]+" "); 
		System.out.println("========================");
	}
}