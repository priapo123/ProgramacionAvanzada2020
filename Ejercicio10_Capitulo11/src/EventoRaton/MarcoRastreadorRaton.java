
package EventoRaton;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame {
    
    private JPanel panelRaton; //Donde ocurrirán los eventos del ratón
    private JLabel barraEstado; //Etiqueta que muestra información
    
    public MarcoRastreadorRaton() {
    
        super("Eventos de ratón");
        panelRaton = new JPanel();
        panelRaton.setBackground(Color.ORANGE); //Yo lo quiero naranja
        add (panelRaton, BorderLayout.CENTER);
        
        barraEstado = new JLabel("ADVERTENCIA: Ratón furea del panel");
        add(barraEstado, BorderLayout.SOUTH);
        
        //Ahora sí, componente de escuha para los eventos del ratón y su movimiento
        ManejadorRaton manejador = new ManejadorRaton(); //Se usará clase privada
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    } //Fin del constructor MarcoRastreadorBoton
    
    private class ManejadorRaton implements MouseListener, MouseMotionListener {
    
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Se hizo click en [%d, %d]", evento.getX(), evento.getY() ) );
        } //Fin de método mouseClicked
        
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Se oprimió en [%d, %d]", evento.getX(), evento.getY() ) );
        } //Fin de método mousePressed
        
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Se soltó en [%d, %d]", evento.getX(), evento.getY() ) );
        } //Fin de método mouseReleased
        
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Ratón entró en [%d, %d]", evento.getX(), evento.getY() ) );
            panelRaton.setBackground(Color.GREEN); //Está bien, pero al e ntrar diréctamente se mueve y no es posible mirar este mensaje
        } //Fin de método mouseEntered
        
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText(String.format("Ratón fuera de JPanel [%d, %d]", evento.getX(), evento.getY() ) );
            panelRaton.setBackground(Color.WHITE);
        } //Fin de método mouseExited
        
        //Ahora siguen los eventos MouseMotionListener, se basan en el movimiento del (estadno primido)
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastró en [%d, %d]", evento.getX(), evento.getY() ) );
        } //Fin de método mouseDragged
        
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Se movió en [%d, %d]", evento.getX(), evento.getY() ) );
        } //Fin de método mouseMoved
        
    } //Fin de la clase privada
    
} //Fin de la clase MarcoRastreadorRaton
