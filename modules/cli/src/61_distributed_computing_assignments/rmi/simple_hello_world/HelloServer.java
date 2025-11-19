import java.io.*;
import java.rmi.*;

public class HelloServer
{
  public static void main (String[] argv) 
  {
    try 
    {
      Hello robj = new Hello ("Hello, world!");
      Naming.rebind ("Hello", robj);
      System.out.println ("Hello Server está pronto.");
    } 
    catch (Exception e) 
    {
      System.out.println ("Hello Server failed: " + e);
    }
  }
}
