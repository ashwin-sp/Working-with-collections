import java.io.*;
import java.lang.*;
import java.util.*;
public class Stack
{
 public static void main(String args[])
 {
  int n=0,top,c,i,x=-1,ele,FULL=0,EMPTY=0;
  ArrayList<Integer> al= new ArrayList<Integer>();
  Scanner input= new Scanner(System.in);
  do
  {
   System.out.println("\n Enter the choice");
   System.out.println("\n 1. Create a new stack");
   System.out.println("\n 2. Add a new element to the top of the stack");
   System.out.println("\n 3. Display the top element");
   System.out.println("\n 4. Display all elements");
   System.out.println("\n 5. Delete the top element");
   System.out.println("\n 6. End");
   c=input.nextInt();
   
   switch(c)
   {
    case 1:
           al.clear();
           x=-1;
           System.out.println("\n Enter the total number of elements permissible in the stack");
           n=input.nextInt();
           EMPTY=n;
           System.out.println("\n Stack created successfully");
           break;
    case 2:            
           if(n!=FULL)
           {
             System.out.println("\n Enter the new element");
             ele=input.nextInt();
             x++;
             al.add(x,new Integer(ele));
             
             n--;
             System.out.println("\n Element added successfully");
           }
           else
           {
             System.out.println("\n The stack is full");              
           }
           break;
    case 3:
           if(n==EMPTY)
           {
             System.out.println("\n The stack is empty");
           }
           else
           {
             System.out.println("\n The top element is "+al.get(x));
           }
           break;
    case 4:
           if(n==EMPTY)
           {
             System.out.println("\n The stack is empty");
           }
           else
           { 
             System.out.println("\n The elements in the stack are");
               System.out.println("\n"+al);
              
           }
           break;  
    case 5:
           if(n==EMPTY)
           {
             System.out.println("\n The stack is empty");
           }
           else
           { 
             System.out.println("\n The top element was deleted "+al.get(x));
             al.remove(x);
             x--;
             n++; 
           }
           break; 
    case 6:
           System.out.println("\n Bye");
           break;
    default:
            System.out.println("\n Not in the range");
            break;
      
   }
  }while(c!=6);
 }
}
