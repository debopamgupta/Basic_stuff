#include <stdio.h>
#include <conio.h>
 void main()
  {
    int n;
    printf("Enter a number");
   scanf("%d",n );
   int res=getRemainder(n);
   if (n==res) {
     printf("Automorphic no");
    }
    else
    {
      printf("not an Automorphic number");
    }
  }
 int getRemainder(int x)
  {
     int c=0,sq=x*x,p=0;
     while(x>0){
       x=x/10;
       c++;
     }

       p=sq%pow(10,c);
       return p;
  }
