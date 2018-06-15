import static Aliens.CuartelAliens.life2;
import static Elfos.CuartelElfos.life;
import static Humanos.CuartelHumanos.life1;
import Menu.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;
//La contraseña es: juguemos
public class Main {
    public static void main(String[] args){
        String Contraseña, jugador1, jugador2;
        
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
        System.out.println(jugador1 + " World");
        
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador2: ");
        jugador2 = leer2.nextLine();
        System.out.println(jugador2 + " World");
        
        do{
            Math.random();
            double numeroRandom = Math.random();
            if (numeroRandom < 0.5){
                System.out.println("Jugador1: " + jugador1 + " empieza");
                Menu menu = Menu.getInstance();
        
                menu.opciones();
            }
            else{
                System.out.println("Jugador2: " + jugador2 + " empieza");
                Menu menu = Menu.getInstance();
        
                menu.opciones();
            }    
        }while(life > 0 && life1 > 0 && life2 > 0); 
        
        if(life == 0){
            System.out.println("Gano: "+ jugador1);
        }
        
        if(life1 == 0){
            System.out.println("Gano: "+ jugador2);
        }
    }
}
