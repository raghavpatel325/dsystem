import java.rmi.*;
import java.rmi.registry.*;
public class RMI_Server{
public static void main(String args[]){
try{
Adder stub=new AdderRemote();
System.out.println("RMI Server has started...");
Naming.rebind("rmi://localhost:5000/sonoo",stub);
}catch(Exception e){
System.out.println(e);
}}}
