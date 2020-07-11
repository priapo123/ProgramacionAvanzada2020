
package OpcionesJComboBox;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

//Habr´menos comentarios por que se me borró todo jajaja

public class MarcoCuadroCombinado extends JFrame {
    
    private JComboBox imagenes;
    private JLabel etiqueta; 
    private String nombres[] = {"ManzanaOro.gif", "LibroEncantado.gif", "PaloEncantado.gif", "BotellaExperiencia.gif"};
    private Icon iconos[] = {
    
        new ImageIcon(nombres [ 0 ] ),
        new ImageIcon(nombres [ 1 ] ),
        new ImageIcon(nombres [ 2 ] ),
        new ImageIcon(nombres [ 3 ] ) };
    
    public MarcoCuadroCombinado() { //Clásico constructor
    
        super("Items encantados");
        setLayout(new FlowLayout() );
        imagenes = new JComboBox(nombres);
        imagenes.setMaximumRowCount(3);
        
        imagenes.addItemListener(
             new ItemListener() { //Esta es la clase interna anónonima, quiere decir que no tiene nombre y es limitada
    
        public void itemStateChanged(ItemEvent evento){
        
            if(evento.getStateChange() == ItemEvent.SELECTED)
                etiqueta.setIcon(iconos[imagenes.getSelectedIndex()]);
                 } //Fin del itemStateChanged
            } //Fin de la clase interna anónima
        ); //Fin del addItemListener
        
        add(imagenes);
        etiqueta = new JLabel(iconos [ 0 ]); //Esatrá seleccionada la primer imágen
        add(etiqueta);
    } //Fin del constructor
} //Fin de la clase
