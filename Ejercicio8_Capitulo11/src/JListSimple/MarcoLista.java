
package JListSimple;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane; // NECESARIO, JComboBox te da barra de desplazamiento, JList no.
import javax.swing.event.ListSelectionListener ;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel; // Útil para lsiat simple

public class MarcoLista extends JFrame {
    
    private JList listaColores;
    private final String nombresColores[] =
    {"Negro", "Azul", "Cian", "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
        "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" }; 
    private final Color colores[] = 
    {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    //Clásico constructor, importante para agregar el JScrollPane
    
    public MarcoLista() {
    
        super("Prueba de cambio de color de fondo");
        setLayout(new FlowLayout() ); //Ya le entední bien al FlowLayout
        listaColores = new JList(nombresColores);
        listaColores.setVisibleRowCount(5);
        
        listaColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Será selección SIMPLE
        add(new JScrollPane(listaColores) );
        listaColores.addListSelectionListener( 
                  new ListSelectionListener() { //Clase interna anónima
        public void valueChanged(ListSelectionEvent evento){
            getContentPane().setBackground(colores [listaColores.getSelectedIndex()]);
                } //Fin del método valueChanged
            } //Fin de la clase interna anónima
        ); //Fin del addListSelectionListener
    } //Fin del constructor
}
