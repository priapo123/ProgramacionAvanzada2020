
package EsquemaFlowLayout;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    
    private JButton botonIzquierda;
    private JButton botonCentro;
    private JButton botonDerecha; //Importante este orden, JFrame los agrega de izquierda a derecha
    private FlowLayout esquema;
    private Container contenedor; 
    
    //Constructor que establece la GUI y sus escuchadores
    public MarcoFlowLayout() {
        
        super("Ejercicio exlusivo FlowLayout");
        
        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema); //No es necesario el new "FlowLayout"
        
        //Botn izquierda
        botonIzquierda = new JButton("Izquierda");
        add(botonIzquierda);
        botonIzquierda.addActionListener(
        
            new ActionListener() { //Clase interna anónima
            
                public void actionPerformed(ActionEvent evento) {
                
                    esquema.setAlignment(FlowLayout.LEFT);
                    esquema.layoutContainer(contenedor); //Alinea los componentes desoués de su movimiento
                } //Fin del método actionPerformed
            } //Fin de la clase interna anónima
        ); //Fin del addActionListener
        
        //Botón centro
        botonCentro = new JButton("Centro");
        add(botonCentro);
        botonCentro.addActionListener(
        
            new ActionListener() { //Clase interna anónima
            
                public void actionPerformed(ActionEvent evento) {
                
                    esquema.setAlignment(FlowLayout.CENTER);
                    esquema.layoutContainer(contenedor); //Alinea los componentes desoués de su movimiento
                } //Fin del método actionPerformed
            } //Fin de la clase interna anónima
        ); //Fin del addActionListener
        
        //Botón derecha
        botonDerecha = new JButton("Derecha");
        add(botonDerecha);
        botonDerecha.addActionListener(
        
            new ActionListener() { //Clase interna anónima
            
                public void actionPerformed(ActionEvent evento) {
                
                    esquema.setAlignment(FlowLayout.RIGHT);
                    esquema.layoutContainer(contenedor); //Alinea los componentes desoués de su movimiento
                } //Fin del método actionPerformed
            } //Fin de la clase interna anónima
        ); //Fin del addActionListener
    } //Fin del constructor MarcoFlowLayout
}// Fin de la clase MarcoFlowLayout