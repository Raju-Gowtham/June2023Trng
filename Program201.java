//Display even or odd
import java.util.Scanner;
public class Program201{
    public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  int n;
	  System.out.print("Enter a number:");
	  n = sc.nextInt();
	  if(n%2==0) {
	    System.out.println("Even");
		System.out.println(n+" is even");
	  }
	  else {
	    System.out.println("Odd");
	    System.out.println(n+" is odd");
	  }
	 }//main
	}//Program201