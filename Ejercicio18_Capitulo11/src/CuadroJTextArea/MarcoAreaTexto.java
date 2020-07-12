
package CuadroJTextArea;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class MarcoAreaTexto extends JFrame {
    
    private JTextArea areaTexto1;
    private JTextArea areaTexto2;
    private JButton copiar; //Muy claros cada uno
    
    public MarcoAreaTexto() {
        
        super("Demostración JTextArea");
        Box cuadro = Box.createHorizontalBox();
        String demo = "Texto de ejemplo\npara mostrar como\n" +
                  "se copia texto por\neventoexterno (Salu2)";
        
        areaTexto1 = new JTextArea(demo, 10, 15); 
        cuadro.add(new JScrollPane(areaTexto1) );
        copiar = new JButton("Copiar >>> ");
        cuadro.add(copiar);
        copiar.addActionListener(
             
            new ActionListener() {
                  
                public void actionPerformed(ActionEvent event) {
                      
                    areaTexto2.setText(areaTexto1.getSelectedText() );
                } //Fin del método actionPerformed
            } //Clase interna anónima
        ); //Clase interna anónima
        
        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2) );
        add(cuadro);
    } //Fin del constructor
} //Fin de la clase MarcoAreaTexto
