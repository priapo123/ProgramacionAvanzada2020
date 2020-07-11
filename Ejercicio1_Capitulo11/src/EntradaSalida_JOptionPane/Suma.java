

package EntradaSalida_JOptionPane;

/**
 * @author Priapo Alejandro Chew Saldaña
 */
import javax.swing.JOptionPane;

public class Suma {
    
    public static void main(String[] args) {
        
        //Entrada de los números a través del JOptionPane
        String PrimerNumero =
                  JOptionPane.showInputDialog("Introduzca el primer número entero");
        String SegundoNumero =
                  JOptionPane.showInputDialog("Introduzca el segundo número entero");
        //Conversión de los string a enteros
        int numero1 = Integer.parseInt(PrimerNumero);
        int numero2 = Integer.parseInt(SegundoNumero);
        
        //Suma de ambos números
        int suma = numero1 + numero2;
        
        //Salida del resultado a través de JOptionPane
        JOptionPane.showMessageDialog(null,"La suma es: "+suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
