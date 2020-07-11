
package BotonJRadio;

/**
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame {
    
    //Se declara cada parte que se usraá en el JFrame, más claro no se puede
    private JTextField recuadroTexto;
    private Font letraSimple;
    private Font letraNegrita;
    private Font letraCursiva;
    private Font letraNegritayCursiva;
    private JRadioButton botonSimple;
    private JRadioButton botonNegrita;
    private JRadioButton botonCursiva;
    private JRadioButton botonNegritaYCursiva;
    private ButtonGroup grupoOpciones;
    
    //Clasico constructor del marco para agregar a JFrame
    public MarcoBotonOpcion() {
    
        super("Elige la opcion de tipo de letra");
        setLayout(new FlowLayout() );
        
        recuadroTexto = new JTextField("Selecciona una opcion y mira como cambia el estilo de letra (^.^)/", 37);
        add(recuadroTexto);
        
        //Botones de opción
        botonSimple = new JRadioButton("Simple", true); //Quiere decir que solo estará seleccionado desde el inicio
        botonNegrita = new JRadioButton("Negrita", false);
        botonCursiva = new JRadioButton("Cursiva", false);
        botonNegritaYCursiva = new JRadioButton("Negrita/Cursiva", false);
        add(botonSimple);
        add(botonNegrita);
        add(botonCursiva);
        add(botonNegritaYCursiva);
        
        //Agregar las opciones al grupo de opciones (la relación lógica)
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(botonSimple);
        grupoOpciones.add(botonNegrita);
        grupoOpciones.add(botonCursiva);
        grupoOpciones.add(botonNegritaYCursiva);
        
        //Ahhora los estilos de letra
        letraSimple = new Font("Serif", Font.PLAIN, 14);
        letraNegrita = new Font("Serif", Font.BOLD, 14);
        letraCursiva = new Font("Serif", Font.ITALIC, 14);
        letraNegritayCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        recuadroTexto.setFont(letraSimple); //Será su tipo de letra por defecto
        
        //Eventos para los objetos JRadioButton
        botonSimple.addItemListener(new ManejadorBotonOpcion(letraSimple) );
        botonNegrita.addItemListener(new ManejadorBotonOpcion(letraNegrita) );
        botonCursiva.addItemListener(new ManejadorBotonOpcion(letraCursiva) );
        botonNegritaYCursiva.addItemListener(new ManejadorBotonOpcion(letraNegritayCursiva) );
    }
    
    //Clase privada ManejadroBotonOpcion
    private class ManejadorBotonOpcion implements ItemListener {
    
    private Font tipoletra;
    
    public ManejadorBotonOpcion (Font f) { //Otroconstructor
    tipoletra = f;
    }
    public void itemStateChanged(ItemEvent evento) {
    
    recuadroTexto.setFont(tipoletra);
    }
    }
}
