import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[])
	{
		int i,n,c=0;
		int A[]=new int[]{2,3,4,5,6,7,8,9,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be searched");
		n=sc.nextInt();
		for(i=0;i<9;i++)
		{
			if(A[i]==n)
			{

				System.out.println("the number is found at position"+(i+1));
				c=1;
			}
		}
		if(c==0)
		{
			System.out.println("The number entered is not found");
		}

	}



  }