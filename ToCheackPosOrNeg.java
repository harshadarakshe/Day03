package Day03;
import java.util.Scanner;
public class ToCheackPosOrNeg {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to check positive or negative");
	int n1=sc.nextInt();
	
	
	if(n1%2==0) {
		System.out.println("enterted number is positive="+n1);
		
	}else {
		System.out.println("enterted number is Negative="+n1);
	}
}
}
