import java.util.*;
import java.rmi.*;  

public class RMI_Client {  
	public static void main(String args[]) {  	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter first number : ");
		int x = sc.nextInt();
		System.out.print(" Enter second number : ");
		int y = sc.nextInt();
		try{  
			Calc stub=(Calc)Naming.lookup("rmi://localhost:5000/sonoo");  
			System.out.println("\n Answer : ");
			System.out.println("   " + x + " + " + y + " = " + stub.add(x,y));
			System.out.println("   " + x + " - " + y + " = " + stub.sub(x,y)); 
			System.out.println("   " + x + " * " + y + " = " + stub.mul(x,y));
			System.out.println("   " + x + " / " + y + " = " + stub.div(x,y));
			System.out.println("   " + x + " % " + y + " = " + stub.mod(x,y));
		} catch(Exception e) {}  
	}  
}  
