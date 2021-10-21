RMI_Server.java :

import java.rmi.*;  
import java.rmi.server.*;
import java.rmi.registry.*; 

interface Calc extends Remote {  
	public int add(int x, int y) throws RemoteException;  
	public int sub(int x, int y) throws RemoteException;
	public int mul(int x, int y) throws RemoteException;
	public int div(int x, int y) throws RemoteException;
	public int mod(int x, int y) throws RemoteException;
}  

  
class CalcRemote extends UnicastRemoteObject implements Calc {  
	CalcRemote() throws RemoteException {  
		super();  
	}  
	public int add(int x, int y) {return x+y;}  
	public int sub(int x, int y) {return x-y;}
	public int mul(int x, int y) {return x*y;}
	public int div(int x, int y) {return x/y;}
	public int mod(int x, int y) {return x%y;}
} 
 
public class RMI_Server {  
	public static void main(String args[]) {  
		try{  
			Calc stub=new CalcRemote();  
			Naming.rebind("rmi://localhost:5000/sonoo", stub);  
		} catch(Exception e) {System.out.println(e);}  
	}  
} 
