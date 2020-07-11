
package TextoImagenVentana;

/**
 * @author Priapo Alejandro Chew Saldaña
 */
import javax.swing.JFrame;

public class PruebaLabel {
    
    public static void main(String[] args) {
        
        LabelFrame marcoEtiqueta = new LabelFrame(); //Aquí se crea el objeto LabelFrame (nuestra ventana)
        marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerra la ventana
        marcoEtiqueta.setSize(375, 485); //Tamaño de la ventana
        marcoEtiqueta.setVisible(true); //Para mostar el marco/ventana
        
    } //Fin del main
    
} //Fin de la clse PruebaLabel
