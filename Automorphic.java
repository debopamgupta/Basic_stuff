import java.util.Scanner;
public class Automorphicnumber
{
  int getRemainder(int x)
  {
    int c=0,sq=x*x,p=0;
    while(x>0){
      x=x/10;
      c++;
    }
    try {
      p=sq%(int)Math.pow(10,c);
      System.out.println(""+p);
    }
    catch(Exception e){}
      finally{return p;}

  }
  public static void main(String[] args)
  {
   Myprogram obj=new Myprogram();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int res=obj.getRemainder(n);
   if (n==res) {
     System.out.println("Automorphic no");
    }
    else {
      System.out.println("not an Automorphic number");
    }
  }
}
