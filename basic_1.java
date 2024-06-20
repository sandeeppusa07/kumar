package Basics;



public class basic_1 {

	public static void main(String[] args) 
	{
		int sum=0;
		//  int sub=0;
		
		int a[]=new int[] {1,2,3,4,5,6};
		//int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
				sum=sum+a[x];
			}
				
		}
		System.out.println("sum of even numbers "+sum);
		
		
	
		
		
		
		

	}

}
