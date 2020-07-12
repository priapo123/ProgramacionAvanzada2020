
package EsquemaGridLayout;

/**
 *
 * @author Priapo AlejandChew
 */

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener {
    
    private JButton botones[];
    private final String nombres[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis"};
    private boolean alternar = true; //Este es el bueno, alternará entre los dos esquemas 
    private Container contenedor; //El contenedor del marco
    private GridLayout cuadricula1;
    private GridLayout cuadricula2;
    
    public MarcoGridLayout() {
        
       super("Cambio de orientación en la cuadrícula");
       cuadricula1 = new GridLayout(2, 3, 5, 5); //2 Columnas - 3 Filas - Espacios de 5
       cuadricula2 = new GridLayout(3, 2); //3 Filas - 2 Columnas
       contenedor = getContentPane(); //Aasí "contenedor" obtiene el panel de contenido
       botones = new JButton[nombres.length]; //Se me había olvidado crear el arreglo de botones xd
       
       setLayout(cuadricula1); //Es como si pusiera FlowLayout, pero esta vez es un GridLayout
                               //También agrega el esquema a JFrame, por lo que cuadrícula 1 es el default
       for(int cuenta = 0; cuenta < nombres.length; cuenta++) { //Este for agrega los nombres en el y los relaciona con los botones
           
       botones[cuenta] = new JButton(nombres[cuenta]);
       botones[cuenta].addActionListener(this);
       add (botones[cuenta] );
       } //Fin del for
    } //Fin del constructor MarcoGridLayout
    
    public void actionPerformed(ActionEvent evento) {
        
        if (alternar)
            contenedor.setLayout(cuadricula2); //Se establece el esquema al primer marco
        else 
            contenedor.setLayout(cuadricula1); //De nuevo hace cambio de esquema
        alternar = !alternar; //Cambia el valor de "alternar" al valor opuesto, wow
        contenedor.validate(); //Redistribuye el contonedor
    } //Fin del método actionPerformed
} //Fin de la clase MarcoGridLayout
