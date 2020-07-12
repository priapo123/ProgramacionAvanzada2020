
package EsquemaBorderLayout;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoBorderLayout extends JFrame implements ActionListener {
    
    private JButton botones[]; //Arreglo de botones, se usará para ocultarlos
    private final String nombres[] = {"Ocultar Norte", "Ocultar Sur", "Ocultar Este", 
        "Ocultar Oeste", "Ocultar Centro"};
    private BorderLayout esquema; 
    
    //Clásico constructor que establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        
        super ("Desaparición de botones");
        esquema = new BorderLayout(5 , 5);
        setLayout(esquema);
        botones = new JButton[nombres.length]; //Da el tamaño del arreglo (al parecer)
        int cuenta; //Se agregó para solucionar el problema de "cuenta"
        
       for(cuenta = 0; cuenta < nombres.length; cuenta++) { //Igual se podía declarar por aqui "cuentas" como int
           
           botones[cuenta] = new JButton(nombres[cuenta] );
           botones[cuenta].addActionListener(this);
       } //Fin del for de cuenta
           add(botones[0],BorderLayout.NORTH);
           add(botones[1],BorderLayout.SOUTH);
           add(botones[2],BorderLayout.EAST);
           add(botones[3],BorderLayout.WEST);
           add(botones[4],BorderLayout.CENTER);
    } //Fin del constructor MarcoBorderLayout
    public void actionPerformed(ActionEvent evento){
        
        for(JButton boton : botones ) {
            
            if (evento.getSource() == boton) boton.setVisible(false);
            else boton.setVisible(true);
        } //Fin del for
        esquema.layoutContainer(getContentPane() );
    } //Fin del método actionPerformed
} //Fin de la clase arcoBorderLayout