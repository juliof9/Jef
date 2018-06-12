import Menu.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String Contraseña;
        
        do{
            Contraseña = JOptionPane.showInputDialog("Hola, para comenzar el juego ingrese la contraseña: ");
            if (Contraseña.equals("juguemos")){
                JOptionPane.showMessageDialog(null, "Se inicio correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "La constraseña es incorrecta, por favor intentalo de nuevo.");
            }
        }while(Contraseña.equals("juguemos") == false);
        
        Menu menu = Menu.getInstance();
        
        menu.opciones();
    }
}
