import java.net.*;
import java.io.*;
import java.util.*;

class ServerClientThread extends Thread
{
  Socket serverClient;
  int clientNo;
  int square;

  ServerClientThread(Socket inSocket, int counter)
  {
    serverClient = inSocket;
    clientNo = counter;
  }

  public void run()
  {
    try
    {
        DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
        DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());

        String clientMessage = "", serverMessage = "";

        while (!clientMessage.equals("ciao"))
        {
          clientMessage = inStream.readUTF();
          System.out.println("Do Cliente-" + clientNo + ": o número é: " + clientMessage);

          try {
            square = Integer.parseInt(clientMessage) * Integer.parseInt(clientMessage);
            serverMessage = "Do Servidor para o Cliente-" + clientNo + ": o quadrado de " + clientMessage + " é " + square;
          } catch (NumberFormatException e) {
            serverMessage = "Do Servidor para o Cliente-" + clientNo + ": '" + clientMessage + "' não é um número válido.";
          }

          outStream.writeUTF(serverMessage);
          outStream.flush();
        }

        inStream.close();
        outStream.close();
        serverClient.close();

    }
    catch (Exception ex)
    {
      System.out.println("Erro: " + ex);
    }
    finally
    {
      System.out.println("Cliente-" + clientNo + " desconectado!");
    }
  }
}
