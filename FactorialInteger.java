import java.util.Scanner;

public class FactorialInteger{
	public static void main(String args[])
	{
		int value,factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		value=sc.nextInt();
		factorial=returnFactorialof(value);
		System.out.println("The factorial of the number is "+factorial);

	}

    public static int returnFactorialof(int n) {
        int f=1;
	   for(int i=1;i<=n;i++)
	   {
	   	f=f*i;
	   }

		return f;
    }
	}	
