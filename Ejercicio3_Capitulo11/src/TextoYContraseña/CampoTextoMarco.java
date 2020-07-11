
package TextoYContraseña;

/**
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout; //Para hacer el diseño
import java.awt.event.ActionListener; //Para vigilar los eventos
import java.awt.event.ActionEvent; //Para realizar los evento (manejo de eventos)
import javax.swing.JFrame; //Para realizar el marco
import javax.swing.JTextField; //Campo de texto
import javax.swing.JPasswordField; //Campo de la contraseña
import javax.swing.JOptionPane; //Entrada y salida a través de ventana

public class CampoTextoMarco extends JFrame 
{
private final JTextField campoTexto1; //Será un campo de texto fijo
private final JTextField campoTexto2; //Será campo de texto construido con texto
private final JTextField campoTexto3; //Campo de texto con texto y tamaño (al parecer...?)
private final JPasswordField campoContrasenia; //El campo de la constraseña con texto

//Constructor del CampoTextoMarco para agregar los campos de texto al marco (de JTexField a JFrame)
public CampoTextoMarco() {
    super("Prueba de JTextField y JPasswordField");
    setLayout(new FlowLayout()); //Establece el esquema del marco
    
    //Construcción del campo de texto de 10 columnas
    campoTexto1 = new JTextField(10);
    add(campoTexto1); //Agregado a JFrame
    
    //Campo de texto con texto predeterminado
    campoTexto2 = new JTextField("Escriba el texto aqui");
    add(campoTexto2); //Agregado a JFrame
    
    //Campo de texto con texto predeterminado y 21 columnas (ajas)
    campoTexto3 = new JTextField("Campo de texto no editable", 21);
    campoTexto3.setEditable(false); //Se deshablita la edición
    add (campoTexto3); //Agregado a JFrame
    
    //Campo de contraseña con texto predeterminado
    campoContrasenia = new JPasswordField("Texto coulto");
    add (campoContrasenia); //Agregado a JFrame
    
    //Los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto1.addActionListener(manejador);
    campoTexto2.addActionListener(manejador);
    campoTexto3.addActionListener(manejador);
    campoContrasenia.addActionListener(manejador);
   } //Fin del constructorCampoTextoMarco

//Clase interna privada para el manejo de eventos
private class ManejadorCampoTexto implements ActionListener {

//actionPerformed para procesar los eventos los eventos del campo de texto
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        String cadena = ""; //Se declara la cadena que se mostrará
        
        //El usuario opmrime Intro en el objeto JTextField campo Texto1
        if (evento.getSource() == campoTexto1)
            cadena = String.format("campoTexto1: %s", evento.getActionCommand());
        
        //El usuario opmrime Intro en el objeto JTextField campo Texto2
        else if (evento.getSource() == campoTexto2)
            cadena = String.format("campoTexto2: %s", evento.getActionCommand());
        
        //El usuario opmrime Intro en el objeto JTextField campo Texto3
        else if (evento.getSource() == campoTexto3)
            cadena = String.format("campoTexto3: %s", evento.getActionCommand());
        
        //El usuario orpimió Intro en el objeto JTextField campoContraseniaSuperSecreta (jaja)
        else if (evento.getSource() == campoContrasenia)
            cadena = String.format("campoConstraseña: %s", new String(campoContrasenia.getPassword()));
        
        //Al fin se muestra el contenido del JTextFiled
        JOptionPane.showMessageDialog(null, cadena);     
    } //Fin del MÉTODO ActionPerformed
  } //Fim de lase interna privada MnejadorCampoTexto
} //Fin de la clase CampoTextoMarco, sigue la MAIN
