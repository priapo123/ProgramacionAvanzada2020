
package ClaseAdaptadora;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame;

public class DetallesRaton {

    public static void main(String[] args) {
        
        MarcoDetallesRaton marcoDetallesBoton = new MarcoDetallesRaton();
        marcoDetallesBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoDetallesBoton.setSize(400, 150); //Tamaño recomendado
        marcoDetallesBoton.setVisible(true);
    }
    
}
