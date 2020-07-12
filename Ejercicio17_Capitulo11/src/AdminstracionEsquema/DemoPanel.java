
package AdminstracionEsquema;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame;

public class DemoPanel {
    
    public static void main(String[] args) {
        
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(400, 200);
        marcoPanel.setVisible(true);
    } //Fin del MAIN
} //Fin de la clase DemoPanel

//No hace nada pero funciona bien