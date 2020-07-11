
package JListMultiple;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MarcoSeleccionMultiple extends JFrame {
    
    private JList listaColores;
    private JList listaCopia; //Su función será copiar los nombres de los colores usados en otra lista
    private final JButton botonCopiar; //Copiará los nombres de los colores
    private final String nombresColores[] = 
    { "Negro", "Azul", "Cian", "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
        "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
    //Contructor
    public MarcoSeleccionMultiple() {
    
        super("Lista de colors y lista de copia");
        setLayout(new FlowLayout());
        
        listaColores = new JList(nombresColores);
        listaColores.setVisibleRowCount(5);
        listaColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add (new JScrollPane(listaColores) ); //Agregada la barrita de desplazamiento
        
        botonCopiar = new JButton("Copiar >>> ");
        botonCopiar.addActionListener(
                  new ActionListener() { //Clase anónima interna
                      public void actionPerformed (ActionEvent evento) {
                      listaCopia.setListData(listaColores.getSelectedValues() ); //¿Por qué la línea en getSelectedValues?
                      } //Fin del actionPerformed
                  } //Fin de la Clase anónima interna
        ); //Fin del addActionListener
        add(botonCopiar);
        
        listaCopia = new JList(); //Lista donde se guardarán los nombres copiados
        listaCopia.setVisibleRowCount(5);
        listaCopia.setFixedCellWidth(100);
        listaCopia.setFixedCellHeight(15);
        listaCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add (new JScrollPane(listaCopia) );
        
    } //Fin del constructor MarcoSeleccionMultiple
} //Fin de la clase MarcoSeleccionMultipe
