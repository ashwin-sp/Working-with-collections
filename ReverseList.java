import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseList
{
 public static void main(String args[])
 {
  int m,i,ele,j;
  LinkedList l= new LinkedList();
  Scanner input = new Scanner(System.in);
  System.out.println("\n Enter the number of elements you want to input");
  m= input.nextInt();
  int count=m;
  System.out.println("\n Enter the elements one by one");
  for(i=0;i<m;i++)
  {
   ele=input.nextInt();
   l.add(new Integer(ele));
  }
  l.add("NULL");
  System.out.println("\n The original list is: ");
  System.out.print(l.get(0));
  for(i=1;i<=m;i++)
  {
   System.out.print("->"+(l.get(i)));
  }
  System.out.println("\n Enter the point of reverse\n");
  int k;
  k= input.nextInt();
  System.out.println("\n");
  int r=0;
  for(i=0;i<m;i++)
  {
   if((count<k)&&(count!=0))
   {
    for(j=(m-1);j>=r;j--)
    {
     System.out.print((l.get(j))+"->");
     count--;
    }
   } 
   else if((i+1)%k==0)
   {
    for(j=i;j>=r;j--)
    {
     System.out.print((l.get(j))+"->");
     count--;
    }
    r=i+1;
   }
  }
  System.out.println("NULL"); 
 }
}
