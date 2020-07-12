
package AdminstracionEsquema;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MarcoPanel extends JFrame {
    
    private JPanel panelBotones;
    private JButton botones[]; //Será arreglo
    
    public MarcoPanel() {
        
        super("Demostración de panel");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length) );
        
        //El útil for para la creación de los botones, su acomodo, y los agegan al panel
        for(int cuenta = 0; cuenta < botones.length; cuenta++){
        
            botones[cuenta] = new JButton( "Boton" + (cuenta + 1) ); //Funciona puesto que empieza en cero
            panelBotones.add(botones[cuenta] ); //Se agregan consecutivamente cada botón
        } //Fin del for
        
        add(panelBotones, BorderLayout.SOUTH); //Agregados en la parte baja del panel
    } //Fin del constructor MarcoPanel()
} //Fin de la clase MarcoPanel
