
package TextoImagenVentana;

/**
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout; //Para especificar el orden de los componentes
import javax.swing.JFrame; //Proporciona las características básicas de una ventana
import javax.swing.JLabel; //Muestra texto e imágenes
import javax.swing.SwingConstants; //Constantes usadas en Swing
import javax.swing.Icon; //Interfaz para manipular imágenes, ojalá funcione
import javax.swing.ImageIcon; //Carga la imagen, ojalá funione x2
       
public class LabelFrame extends JFrame //Se extiende a JFrame para heredar del mismo
{   
    private JLabel etiqueta1; //Etiqueta de texto
    private JLabel etiqueta2; //Etiqueta de texto e ícono
    private JLabel etiqueta3; //Etiqueta con texto adicional e ícono
    
    //Constructor de LabelFrame, mismo que agrega objetos a JLabel o JFrame
    public LabelFrame()
    {
        super("Prueba de JLabel (Etiqueta)");
        setLayout(new FlowLayout()); //Aquí se establece el marco
        
        //Constructor JLabel con String
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta 1"); //Aqií esta el String
        add(etiqueta1); //Ahora ya se agrega esta etoqueta al JFrame (la ventana)
        
        //Constructor de JLabel con argumentos, de cadena, Icono y alineación (ojalá funcione)
        ImageIcon campana = new ImageIcon(("campana.gif")); //Tuve que omitir getClass().getResource
        etiqueta2 = new JLabel("Etiqueta con texto e icono",campana,SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta 2");
        add(etiqueta2); //Y ya se agrega la segunda etiqueta al JFrame

        //Constructor de JLabel (etiqueta) sin argumentos
        etiqueta3 = new JLabel();
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(campana);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta 3");
        add(etiqueta3);
        
    } //Fin del cosntructor LabelFrame
    
} //Fin de la clase LabelFrame
