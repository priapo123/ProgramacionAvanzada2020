
package EsquemaGridLayout;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame; 

public class DemoGridLayout {
    
    public static void main(String[] args) {
        
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
        marcoGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoGridLayout.setSize(400, 200);
        marcoGridLayout.setVisible(true);
    } // Fin del main
} //Fin del DemoGridLayout
