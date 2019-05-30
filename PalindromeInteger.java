import java.util.Scanner;

public class PalindromeInteger{
	public static void main(String args[])
	{
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		value=sc.nextInt();
		if(isPalindrome(value))
		{
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not a palindrome number");
		}

	}

    public static boolean isPalindrome(int x) {
        int copy=x,n=x,r,rev=0;

        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(copy==rev)
            return true;
        else
            return false;

    }

  }