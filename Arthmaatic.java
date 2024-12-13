package Day03;

import java.util.Scanner;

public class Arthmaatic {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the first number");
	int num1=sc.nextInt();
	System.out.println("enter the Second number");
	int num2=sc.nextInt();
	
	//+,-,*
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1%num2);
	System.out.println(num1/num2);
	
}
}
