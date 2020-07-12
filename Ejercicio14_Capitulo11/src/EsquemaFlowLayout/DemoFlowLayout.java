
package EsquemaFlowLayout;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame;

public class DemoFlowLayout {

    public static void main(String[] args) {
        
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(500, 100); //Largo para que se note
        marcoFlowLayout.setVisible(true);
    } //Fin del main
} //Fin de la clase DemoFlowLayout