import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder{
	
    String[] userDB = {"Nisarg","Keyur","Rinkesh","Rashesh"};
    AdderRemote()throws RemoteException{
    super();
    }
public String findUser(int id){
    return userDB[id];
}
}
