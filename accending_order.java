package Basics;

import java.util.Arrays;

public class accending_order {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,10,3,100,78,88,33,49,-23,-32,-68};
//		for(int temp:a)
//			System.out.print(temp+" ");
//		Arrays.sort(a);
//		System.out.println();
//		for(int temp:a)
//			System.out.print(temp+" ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++ )
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
						
		}
		for(int temp:a)
		{
			System.out.println(temp);
		}
	
		
		

	}

}
