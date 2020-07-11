
package BotonesSencillos;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame
{
    //Botones, con texto (simple) y con texto e imagen (elegante)
    private JButton botonSimple;
    private JButton botonElegante;
    
    public MarcoBoton() //Constructor del marco del botón
    {
    super("Prueba de botones (debe ir en la parte superior de la ventana)"); //Texto en la parte superior de la ventana
    setLayout(new FlowLayout()); //Se establece el marco
    botonSimple = new JButton("Boton SIMPLE"); //Será solo con texto
    add(botonSimple); //Agregado
    
    Icon elegante1 = new ImageIcon("elegante.gif");
    Icon elegante2 = new ImageIcon("elegante2.gif");
    botonElegante = new JButton("Boton ELEGANTE", elegante1); //BAM, aquí entra la imagen
    botonElegante.setRolloverIcon(elegante2); //Imagen de sustitución (creo que cuando haga clic en el botón)
    add(botonElegante); //Agregao x2, sigue el manejador de boton
    
    //ManejadorBoton para manejar los eventos del botón, será necesaria clase interna
    ManejadorBoton manejador = new ManejadorBoton();
    botonSimple.addActionListener(manejador);
    botonElegante.addActionListener(manejador);
    } //Fin del constructor MarcoBoton
    
    private class ManejadorBoton implements ActionListener
    {
        //Se maneja el evento del botón (MÉTODO)
        public void actionPerformed(ActionEvent evento)
        {
        JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", evento.getActionCommand()));
        } //Fin del método ActionPerformed
    }//Fin de la clase interna privada ManejadorBoton
}//Fin de la clase MarcoBoton
