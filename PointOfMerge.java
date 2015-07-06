import java.io.*;
import java.lang.*;
import java.util.*;
public class PointOfMerge
{
 public static void main(String args[])
 {
  LinkedList l1= new LinkedList();
  LinkedList l2= new LinkedList();
  int m,n,i,ele,a=0,b=0;
  Scanner input= new Scanner(System.in);
  System.out.println("\n Enter the number of elements in first list");
  m= input.nextInt();
  System.out.println("\n Enter the elements one by one");
  for(i=0;i<m;i++)
  {
   ele= input.nextInt();
   l1.add(new Integer(ele));
  }
  System.out.println("\n Enter the number of elements in second list");
  n= input.nextInt();
  System.out.println("\n Enter the elements one by one");
  for(i=0;i<n;i++)
  {
   ele= input.nextInt();
   l2.add(new Integer(ele));
  }
  b=(Integer)(l2.get(n-1));
  for(i=0;i<m;i++)
  {
   a=(Integer)(l1.get(i));
   if(a==b)  
   {
    System.out.println("\n The merge point is "+i+" in the first list");
   }
  }
 }
}
