import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class ProgramaBacana {

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageForeground", Color.WHITE); 
        UIManager.put("OptionPane.background", Color.BLACK); 
        UIManager.put("Panel.background", Color.BLACK); 

        UIManager.put("OptionPane.font", new FontUIResource("Comic Sans MS", 0, 16)); 

        int i = 0;
        for (i = 0; i < 4; i++) {

            int num = parseInt(JOptionPane.showInputDialog(null, "Entre com um número"));
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "É par!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "É Impar!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
