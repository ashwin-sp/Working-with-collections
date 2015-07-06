import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class LinkedListAddition
{
 public static void main(String args[])
 {
  LinkedList l1= new LinkedList();
  LinkedList l2= new LinkedList();
  int m,n,i,ele;
  int r=1;
  Scanner input=new Scanner(System.in);
  System.out.println("\n Enter the number of elements to be in the list");
  m= input.nextInt();
  System.out.println("\n Enter the elements of the first list one by one");
  for(i=0;i<m;i++)
  {
   ele=input.nextInt();
   l1.add(new Integer(ele));
  }
  System.out.println("\n Enter the elements of the second list one by one");
  for(i=0;i<m;i++)
  {
   ele=input.nextInt();
   l2.add(new Integer(ele));
  }
  int sum1=0,sum2=0;
  for(i=0;i<m;i++)
  { 
   r*=10;
  }
  
  for(i=0;i<m;i++)
  { 
    r=r/10;
    sum1=sum1+(((Integer)(l1.get(i)))*(r));
    sum2=sum2+(((Integer)(l2.get(i)))*(r));
  }
  for(i=0;i<m;i++)
  { 
   r*=10;
  }
  
  int sum3=sum1+sum2;
  String answer = Integer.toString(sum3);
  int s = answer.length();
  char toPrint[] = answer.toCharArray();
  System.out.print(toPrint[0]);
  for(i = 1; i < s; i++) {
	System.out.print(" -> " + toPrint[i]);
  }
 }
}
