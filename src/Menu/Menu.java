package Menu;

import java.util.Scanner;

public class Menu {
    
    private static Menu instance;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        if(instance == null){
            instance = new Menu();
        }
        return instance;
    }
    
    public void opciones(){
        int op = 5;
        Scanner teclado = new Scanner(System.in);
        
        while (op != 4){
            System.out.println("Bienvenido al juego... Que raza deseas elegir?");
            System.out.println("1. Humanos");
            System.out.println("2. Aliens");
            System.out.println("3. Elfos");
            System.out.println("4. Salir");
            
            op = teclado.nextInt();
            
            switch(op){
                case 1:
                    int valor = 5;
                    Scanner leer = new Scanner(System.in);
                    
                    while (valor != 4){
                        System.out.println("Que desea hacer? ");
                        System.out.println("1. Cuartel de soldados");
                        System.out.println("2. Milicia");
                        System.out.println("3. Edificaciones");
                        System.out.println("4. Salir");
                        
                        valor = leer.nextInt();
                        
                        switch(valor){
                            case 1:
                                int a = 3;
                                Scanner lee = new Scanner(System.in);
                                
                                while (a != 3){
                                    System.out.println("Que soldado desea entrenar?");
                                    System.out.println("1. Peloton");
                                    System.out.println("2. Super Soldado (CAPITAN AMERICA)");
                                    System.out.println("3. Terminar Turno");
                                    
                                    a = lee.nextInt();
                                    
                                    switch(a){
                                        case 1:
                                            AbstracFactory factory;
                                            
                                            
                                    }
                                }
                                
                                
                                
                        }
                    }
            }
        }
    }
}
