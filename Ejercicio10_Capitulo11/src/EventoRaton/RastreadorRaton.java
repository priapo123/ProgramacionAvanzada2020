
package EventoRaton;

/**
 *
 * @author Priapo Alejandro Chew Saldaña
 */
import javax.swing.JFrame;

public class RastreadorRaton {
    
    public static void main(String[] args) {
        
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(350, 150);
        marcoRastreadorRaton.setVisible(true);
    } //Fibn del main
} //Fin de la clase RastreadorRaton

//Aún falta corregir un par de eventos
