import Menu.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String Contraseña, jugador1, jugador2;
        int juego = 1;
        
        do{
            Contraseña = JOptionPane.showInputDialog("Hola, para comenzar el juego ingrese la contraseña: ");
            if (Contraseña.equals("juguemos")){
                JOptionPane.showMessageDialog(null, "Se inicio correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "La constraseña es incorrecta, por favor intentalo de nuevo.");
            }
        }while(Contraseña.equals("juguemos") == false);
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugardor1: ");
        jugador1 = leer.nextLine();
        System.out.println(jugador1 + " Words");
        
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador2: ");
        jugador2 = leer2.nextLine();
        
        do{
            Math.random();
            double numeroRandom = Math.random();
            if (numeroRandom < 0.5){
                System.out.println("Jugador1" + jugador1 + "empieza");
                Menu menu = Menu.getInstance();
        
                menu.opciones();
            }
            else{
                System.out.println("Jugador2: " + jugador2 + "empieza");
                Menu menu = Menu.getInstance();
        
                menu.opciones();
            }    
        }while(juego != 0); 
    }
}
