import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class ProgramaBacana {

    public static void main(String[] args)
    {       
      int i = 0;  
      for ( i = 0; i < 4; i++ ){
          
      int num = parseInt(JOptionPane.showInputDialog(null, "Entre com um número"));
      if(num % 2 == 0) {
          JOptionPane.showMessageDialog(null, "É par!");
      } else {
          JOptionPane.showMessageDialog(null, "É Impar!");  
      } 
      }
      
    }
}
