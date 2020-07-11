
package EventoTecla;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; //Ambos para teclas 
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    
    private String linea1 = "";
    private String linea2 = "";
    private String linea3 = "";
    private JTextArea areaTexto; //No hacen falta explicaciones
    
    public MarcoDemoTeclas(){
        
        super("Eventos de teclas");
        
        areaTexto = new JTextArea(10, 15); //Tamaños
        areaTexto.setText("Oprima una tecla");
        areaTexto.setEnabled(false); //Deshabilita el área de texto
        areaTexto.setDisabledTextColor(Color.ORANGE); //Yo lo quiero cyan 
        add(areaTexto);
        
        addKeyListener(this); //Vigilará los eventos de oprimir teclas
    } //Fin del constrcutorMarcoDemoTeclas
    
    public void keyPressed(KeyEvent evento) { //Método keyPressed (mismo que utiliza el método getKeyCode...) (PRESIONAR TECLA)
        
        linea1 = String.format("Tecla oprimida: %s", evento.getKeyCode() ); //Convertirá a cadena la info de la tecla
        etablecerLineas1y2(evento); //Un método que se definirá líneas adelante
    } //Fin del método keyPressed (... para obtener código de tecla virtual)
    
    public void keyReleased(KeyEvent evento) { //SOLTAR TECLA
        
        linea1 = String.format("Tecla liberada: %s", evento.getKeyCode() );
        etablecerLineas1y2(evento); 
    } //Fin del método keyReleased
    
    public void keyTyped (KeyEvent evento) { //TECLA DE ACCIÓN (DÉJA VU!!!! Ya viví esto)
        
        linea1 = String.format("Tecla oprimida: %s", evento.getKeyChar() );
        etablecerLineas1y2(evento);
    } ////Fin del método keyTyped
    
    private void etablecerLineas1y2(KeyEvent evento) { //Método etablecerLineas1y2, al fin
        
        linea2 = String.format("La tecla %s es una tecla de acción", (evento.isActionKey() ? "" : "no ") );
        String temp = evento.getKeyModifiersText(evento.getModifiers());
        
        linea3 = String.format("Teclas modificadoras oprimidas: %s",
                  (temp.equals("") ? "ninguna" : temp ) ); //Imprime los modificaores
        
        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1,linea2,linea3) );
    } //Fin del método etablecerLineas1y2
} //Fin de la clase MarcoDemoTeclas