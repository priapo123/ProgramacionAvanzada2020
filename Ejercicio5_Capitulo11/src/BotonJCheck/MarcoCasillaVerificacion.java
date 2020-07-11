
package BotonJCheck;

/*
 * @author Priapo Alejandro Chew Saldaña
 */

//NO habrá muchos comentarios por que es la tercera vez que lo hago, he tenido muchios errores

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame
{
    
    private JTextField campoTexto;
    private JCheckBox letraNegrita;
    private JCheckBox letraCursiva;
    
    public MarcoCasillaVerificacion() //Como siempre, el constructor
    {
    
    super("Cambia el estilo de la letra");
    setLayout(new FlowLayout() );
    
    campoTexto = new JTextField("Observe como cambia el estilo de letra", 20);
    campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
    add(campoTexto);
    
    letraNegrita = new JCheckBox("Negrita");
    add(letraNegrita);
    letraCursiva = new JCheckBox("Cursiva");
    add(letraCursiva);
    
    //Se me había olvidado añadirlas al JFrame jajaja
    
    ManejadorCheckBox manejador = new ManejadorCheckBox();
    letraNegrita.addItemListener(manejador);
    letraCursiva.addItemListener(manejador);
    }//Fin del constructor
    
    private class ManejadorCheckBox implements ItemListener
    {
    
        private int valNegrita = Font.PLAIN;
        private int valCursiva = Font.PLAIN;
        
       
        public void itemStateChanged(ItemEvent evento)
        {
        
            if (evento.getSource() == letraNegrita)
                valNegrita = letraNegrita.isSelected() ? Font.BOLD : Font.PLAIN;
            
            if (evento.getSource() == letraCursiva)
                valCursiva = letraCursiva.isSelected() ? Font.ITALIC : Font.PLAIN;
            
            campoTexto.setFont(new Font("Serif", valNegrita + valCursiva, 14));
        }
    }
}
