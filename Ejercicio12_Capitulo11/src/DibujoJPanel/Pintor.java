
package DibujoJPanel;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor {
    
    public static void main(String[] args) {
        
        //Hay que crear el JFrame
        JFrame aplicacion = new JFrame("Pizarra de dibujo sencilla creada en Java");
        //Agregar Panel de dibujo;
        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);
        //Agregar etiqueta en la parte inferior
        aplicacion.add(new JLabel("Arrastre el ratón para dibujar"), BorderLayout.SOUTH);
        
        //Ahora sí, lo clásico de cada main
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(600, 300); //Un poco más grande para qeu valga la pena
        aplicacion.setVisible(true);
    } //Fin del main
} //Fin de la clase Pintor