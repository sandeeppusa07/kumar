package Basics;

public class adding_ofarrays {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {2,4,5,6,7,1};
		int c[]=new int [a.length+b.length];
		
	for(int x=0;x<=a.length-1;x++)
	{
		c[x]=a[x];
		System.out.println(c[x]);
		 
	}
	for(int x=0;x<=b.length-1;x++)
	{
		c[x]=b[x];
		System.out.print(c[x]+" ");
	}
	}

}
