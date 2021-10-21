import java.io.*;
import java.net.*;
class Server
{ 
 public static void main(String[] args) throws Exception 
 { 
  ServerSocket sersock = new ServerSocket(3000); 
  System.out.println("Server Started... "); 
  Socket sock = sersock.accept( ); 
  OutputStream ostream = sock.getOutputStream(); 
  PrintWriter pwrite = new PrintWriter(ostream, true);  
  InputStream istream = sock.getInputStream(); 
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
  String fun;
  int id;
  String[] Users = {"Nisarg","Rohit","Rinkesh","Tanmay","Raghav"};
  while(true) 
  {
   fun = receiveRead.readLine();
   if(fun != null) 
    System.out.println("Requested Procedure : "+fun);
   id = Integer.parseInt(receiveRead.readLine());
   System.out.println("Parameters: "+id);
   if(fun.compareTo("finduser")==0)
   {
    pwrite.println("User = "+Users[id]); 
   }
   System.out.flush();} } }
