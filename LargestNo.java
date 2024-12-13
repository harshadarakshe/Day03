package Day03;

import java.util.Scanner;

public class LargestNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int no1=sc.nextInt();
	System.out.println("enter second number");
	int no2=sc.nextInt();
	
	if(no1>=no2)
	{
		System.out.println("The number is greter="+ no1);
	}
	else
	{

		System.out.println("the number is greater"+no2);
	}
		
}
}
