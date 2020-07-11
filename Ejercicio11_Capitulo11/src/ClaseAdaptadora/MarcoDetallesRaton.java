
package ClaseAdaptadora;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import javax.swing.JFrame; 
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MarcoDetallesRaton extends JFrame {
    
    private String detalles; //Del JLabel 
    private JLabel barraDeEstado;
    
    public MarcoDetallesRaton() {
        super("Clics y botones del ratón (buen nombre)"); //Esta vez no hay FlowLayout
        barraDeEstado = new JLabel("Haga click en el ratón");
        add(barraDeEstado, BorderLayout.SOUTH); 
        addMouseListener(new ManejadorClickRaton() );
    } //Fin del constructor MarcoDetallesRaton
        
        //Clase interna para el manejo de ventos de ratón
        private class ManejadorClickRaton extends MouseAdapter {
            public void mouseClicked(MouseEvent evento) {
                
                int xPos = evento.getX();
                int yPos = evento.getY();
                detalles = String.format("Se hizo click %d veces", evento.getClickCount() );
                
                if(evento.isMetaDown() )detalles += "con el botón derecho del ratón";
                else if (evento.isAltDown() )detalles += "con el botón central del ratón";
                else detalles += "con el botón izquierdo del ratón";
                
                barraDeEstado.setText(detalles);
            } // Fin del métodod mouseClicked
        } //Fin de la clase interna ManejadorClickRaton
} //Fin de la clase MarcoDetallesRaton