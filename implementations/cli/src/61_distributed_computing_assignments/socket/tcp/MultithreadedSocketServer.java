// CLASSE DO SERVIDOR
import java.net.*;
import java.io.*;
import java.util.*;

public class MultithreadedSocketServer
{
  public static void main(String[] args) throws Exception {

    try
    {
      ServerSocket server=new ServerSocket(8888);
      int counter=0;
      System.out.println("Servidor iniciado...");

      while(true)
      {
        counter++;
        Socket serverClient=server.accept();  // o servidor aceita a solicitação de conexão do cliente
        System.out.println(" >> " + "Cliente Nº: " + counter + " conectado!");

        ServerClientThread sct = new ServerClientThread(serverClient,counter); // envia a solicitação para uma thread separada
        sct.start();
      }

    }
    catch(Exception e)
    {

    }
  }
}
