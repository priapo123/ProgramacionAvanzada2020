
package DibujoJPanel;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel { //Esta vez es necesario heredar de JPanek
    
    private int cuentaPuntos = 0; //variable de conteo de puntos
    private Point puntos[] = new Point[10000]; //Arreglo de 10,000 objetos Point
    
    //Cosntructor de la GUI, incluye el manejador de eventos del ratón
    public PanelDibujo() {
        addMouseMotionListener(
                  new MouseMotionAdapter() { // Esta es una clase anónima
                      public void mouseDragged(MouseEvent evento){
                          if (cuentaPuntos < puntos.length) {
                              puntos[cuentaPuntos] = evento.getPoint();
                              cuentaPuntos++; //Aunque bien podría usarse +=
                              repaint();
                        } //Fin del if
                    }//Fin del método mouseDragged
                } //Fin de la clase anónima
        ); //Batallé 1 HORA, me faltaba la palabra "Motion" en addMouse-Listener
    } //Fin del constructor PanelDibujo
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //Esto borra el área de dibujo

        //Esto dibuja los en el arreglo
        for(int i = 0; i < cuentaPuntos; i++)
            g.fillOval(puntos [i].x, puntos [i].y, 4, 4);
    } // Fin del método paintComponent
} //Fin de la clase PanelDibujo
