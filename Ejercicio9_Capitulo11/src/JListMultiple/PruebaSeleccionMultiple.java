
package JListMultiple;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame;

public class PruebaSeleccionMultiple {

    public static void main(String[] args) {
        
        MarcoSeleccionMultiple marcoSeleccionMultiple = new MarcoSeleccionMultiple();
        marcoSeleccionMultiple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoSeleccionMultiple.setSize(350, 150);
        marcoSeleccionMultiple.setVisible(true);
    } //Fin del main
} //Fin de la clase PruebaSeleccionMultiple

//Falla el botón, solo copia un elemento //Actualización: SÍ FUNCIONA BIEN