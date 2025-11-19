import java.io.*;
import java.net.*;

class UDPClient
{
   public static void main(String args[]) throws Exception
   {
       DatagramSocket clientSocket = new DatagramSocket();
       byte[] sendData = new byte[1024];
       byte[] receiveData = new byte[1024];

       BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
       InetAddress IPAddress = InetAddress.getByName("localhost");

       while(true)
       {
           System.out.print("Digite uma mensagem (ou 'ciao' para sair): ");
           String sentence = inFromUser.readLine();
           if(sentence.equalsIgnoreCase("ciao"))
               break;

           sendData = sentence.getBytes();
           DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
           clientSocket.send(sendPacket);

           DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
           clientSocket.receive(receivePacket);

           String modifiedSentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
           System.out.println("DO SERVIDOR: " + modifiedSentence);
       }

       clientSocket.close();
   }
}
