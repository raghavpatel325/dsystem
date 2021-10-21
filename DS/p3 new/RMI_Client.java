import java.rmi.*;
public class RMI_Client{
public static void main(String args[]){
try{
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream)); 
while(true){
    System.out.print("Enter User's Id: ");
    String id = receiveRead.readLine();
    System.out.println(stub.findUser(id));
}
}catch(Exception e){System.out.println(e);}
}
}
