import java.util.*;
class StringSort
{
   public static void main(String args[])
   {
      String s ="";
      String s1="";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word in all capital");
      s = sc.nextLine();
      char chararray[] = new char [s.length()];
      chararray = s.toCharArray();

      for(int i=0;i<chararray.length - 1; i++)
      {
         for(int j=0 ; j<(chararray.length - i - 1); j++)
         {

            if((int)chararray[j]>(int)chararray[j+1])
            {
               char temp = chararray[j];
               chararray[j] = chararray[j+1];
               chararray[j+1] = temp;
            }

            // for (int k = 0; k < chararray.length; k++) {
            //    s1 = s1 + chararray[k];
            //    System.out.print("" + chararray[k]);
            //    System.out.print("\n");
         }

      }

       for(int k=0;k<chararray.length;k++){
          s1=s1+chararray[k];
       }

       System.out.println("The sorted String is " + s1);
      sc.close();
   }
}
