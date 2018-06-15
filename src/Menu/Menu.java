package Menu;

import Aliens.ElixirOscuroA;
import Aliens.MinaElixir;
import Aliens.MinaOro;
import Aliens.jugarAliens;
import java.util.Scanner;
import ClasesAbstractas.AbstractFactory;
import ClasesAbstractas.FactoryProducer;
import Elfos.Arqueros;
import Elfos.Avionetas;
import Elfos.Elefantes;
import Elfos.ElixirOscuroE;
import Elfos.Mago;
import Elfos.MinaElixirE;
import Elfos.MinaOroE;
import Elfos.jugarElfos;
import Humanos.BancoOro;
import Humanos.Elixir;
import Humanos.ElixirOscuro;
import Humanos.jugarHumanos;

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
            System.out.println("Bienvenido al juego... Que raza deseas elegir? \n");
            System.out.println("1. Humanos (ventaja: todo es de bajo costo desventaja: no hacen tanto daño las milicias)");
            System.out.println("2. Aliens (ventaja: hacen mas daño las milicias desventaja: poseen poca vida)");
            System.out.println("3. Elfos (ventaja: tiene mas vida todo desventaja: tiene un mayor costo de creacion)");
            System.out.println("4. Salir \n");
            
            op = teclado.nextInt();
            
            switch(op){
                case 1:
                    int valor = 5;
                    Scanner leer = new Scanner(System.in);
                    BancoOro bancooro = new BancoOro();
                    bancooro.setRecursos(10000);
                    Elixir elixir = new Elixir();
                    elixir.setRecursos1(5000);
                    ElixirOscuro oscuro = new ElixirOscuro();
                    oscuro.setRecursos2(3000);
                    System.out.println("Tus recursos son: ");
                    System.out.println("Oro: "+bancooro.getRecursos());
                    System.out.println("Elixir: "+elixir.getRecursos1());
                    System.out.println("Elixir Oscuro: "+oscuro.getRecursos2());
                    
                    while (valor != 4){
                        System.out.println("En que desea gastar sus recursos de la raza humanos? ");
                        System.out.println("1. Milicia");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir \n");
                        
                        valor = leer.nextInt();
                        
                        switch(valor){
                            case 1:
                                int a = 4;
                                Scanner lee = new Scanner(System.in);
                                
                                while (a != 3){
                                    System.out.println("Que soldado desea entrenar?");
                                    System.out.println("1. Peloton costo: 500 de Elixir");
                                    System.out.println("2. Super Soldado, Francotirador costo: 800 de Elixir oscuro");
                                    System.out.println("3. Salir \n");
                                    
                                    a = lee.nextInt();
                                    
                                    switch(a){
                                        case 1:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory factory;
                                            
                                            factory = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Peloton = factory.getjugarHumanos("Peloton");
                                            Peloton.atacar();
                                            break;
                                        case 2:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory factor;
                                            
                                            factor = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Francotirador = factor.getjugarHumanos("Francotirador");
                                            Francotirador.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Adios, saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Usten ingreso" + a + "Por favor ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 2:
                                int b = 5;
                                Scanner lectura = new Scanner(System.in);
                                while (b != 4){
                                    System.out.println("Cual edificacion desea construir?");
                                    System.out.println("1. Banco de Oro costo: 900 de Oro");
                                    System.out.println("2. Mina de Elixir costo: 550 de Oro");
                                    System.out.println("3. Mina Elixir Oscuro costo: 600 de Oro");
                                    System.out.println("4. Salir \n");
                                    
                                    b = lectura.nextInt();
                                    
                                    switch(b){
                                        case 1:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory facto;
                                            facto = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos BancoOro = facto.getjugarHumanos("BancoOro");
                                            BancoOro.recolectar1();
                                            break;
                                        case 2:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory fact;
                                            fact = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Elixir = fact.getjugarHumanos("Elixir");
                                            Elixir.recolectar1();
                                            break;
                                        case 3:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory fac;
                                            fac = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos ElixirOscuro = fac.getjugarHumanos("ElixirOscuro");
                                            ElixirOscuro.recolectar1();
                                        case 4:
                                            System.out.println("Adios...");
                                            break;
                                        default:
                                            System.out.println("Ingreso el numero: " + b +"Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 3:
                                int c = 4;
                                Scanner tecla = new Scanner(System.in);
                                while (c != 3){
                                    System.out.println("Que vehiculo desea contruir? \n");
                                    System.out.println("1. Avion costo: 700 de elixir");
                                    System.out.println("2. Tanque costo: 800 de elixir");
                                    System.out.println("3. Salir \n");
                                    
                                    c = tecla.nextInt();
                                    
                                    switch(c){
                                        case 1:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory fa;
                                            fa = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Avion = fa.getjugarHumanos("Avion");
                                            Avion.atacar();
                                            break;
                                        case 2:
                                            System.out.println("Oro: ");
                                            System.out.println("Elixir: ");
                                            System.out.println("Elixir oscuro: ");
                                            AbstractFactory f;
                                            f = FactoryProducer.getFactory("jugarHumanos");
                                            jugarHumanos Tanque = f.getjugarHumanos("Tanque");
                                            Tanque.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Adios...");
                                            break;
                                        default:
                                            System.out.println("Ingreso: "+ c +"Ingrese una opcion valida.");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Saliendo de este bloque");
                                break;
                        }
                    }
                    break;
                case 2:
                    int valor1 = 5;
                    Scanner teclas = new Scanner(System.in);
                    MinaOro oro = new MinaOro();
                    oro.setRecursos03(10000);
                    MinaElixir elixir1 = new MinaElixir();
                    elixir1.setRecursos02(5000);
                    ElixirOscuroA oscuro1 = new ElixirOscuroA();
                    oscuro1.setRecursos01(3000);
                    System.out.println("Tus recursos son: ");
                    System.out.println("Oro: "+oro.getRecursos03());
                    System.out.println("Elixir: "+elixir1.getRecursos02());
                    System.out.println("Elixir Oscuro: "+oscuro1.getRecursos01());
                    
                    while (valor1 != 4){
                        System.out.println("Se escogio la raza Aliens, que desea hacer? ");
                        System.out.println("1. Milicias");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir \n");
                        
                        valor1 = teclas.nextInt();
                        
                        switch(valor1){
                            case 1:
                                int d = 4;
                                Scanner leer1 = new Scanner(System.in);
                                
                                while (d != 3){
                                    System.out.println("Sus milicias son las siguientes: \n");
                                    System.out.println("1. Aliens");
                                    System.out.println("2. Depredadores (Super soldado)");
                                    System.out.println("3. Salir \n");
                                    
                                    d = leer1.nextInt();
                                    
                                    switch(d){
                                        case 1:
                                            AbstractFactory factory1;
                                            factory1 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Aliens = factory1.getjugarAliens("Aliens");
                                            Aliens.atacar();
                                            break;
                                        case 2:
                                            AbstractFactory factory2;
                                            factory2 =FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Depredadores = factory2.getjugarAliens("Depredadores");
                                            Depredadores.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo");
                                            break;
                                        default:
                                            System.out.println("Usted ingreso: " + d + " Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 2:
                                int e = 5;
                                Scanner leer3 = new Scanner(System.in);
                                
                                while(e != 4){
                                    System.out.println("Que desea comenzar a contruir? \n");
                                    System.out.println("1. Mina de Oro");
                                    System.out.println("2. Mina de Elixir");
                                    System.out.println("3. Mina de Elixir Oscuro");
                                    System.out.println("4. Salir \n");
                                    
                                    e = leer3.nextInt();
                                    
                                    switch(e){
                                        case 1:
                                            AbstractFactory factory3;
                                            factory3 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens MinaOro = factory3.getjugarAliens("MinaOro");
                                            MinaOro.recolectar();
                                            break;
                                        case 2:
                                            AbstractFactory factory4;
                                            factory4 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens MinaElixir = factory4.getjugarAliens("MinaElixir");
                                            MinaElixir.recolectar();
                                            break;
                                        case 3:
                                            AbstractFactory factory5;
                                            factory5 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens ElixirOscuro = factory5.getjugarAliens("ElixirOscuro");
                                            ElixirOscuro.recolectar();
                                            break;
                                        case 4:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Ingreso: " + e + "Ingrese una opcion valida");
                                    }
                                }
                                break;
                            case 3:
                                int f = 4;
                                Scanner leer6 = new Scanner(System.in);
                                
                                while( f != 3){
                                    System.out.println("Que vehiculos de guerra desea construir? \n");
                                    System.out.println("1. Omnis");
                                    System.out.println("2. Naves");
                                    System.out.println("3. Salir \n");
                                    
                                    f = leer6.nextInt();
                                    
                                    switch(f){
                                        case 1:
                                            AbstractFactory factory6;
                                            factory6 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Omni = factory6.getjugarAliens("Omni");
                                            Omni.atacar();
                                            break;
                                        case 2:
                                            AbstractFactory factory7;
                                            factory7 = FactoryProducer.getFactory("jugarAliens");
                                            jugarAliens Naves = factory7.getjugarAliens("Naves");
                                            Naves.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Ingreso el valor de: " + f + "Ingrese otra opcion");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Saliendo de este bloque");
                                break;
                            default:
                                System.out.println("Ingreso: " + valor1 + "Por favor ingrese una opcion valida");
                        }
                    }
                    break;
                case 3:
                    int valor2 = 5;
                    Scanner leer4 = new Scanner(System.in);
                    Arqueros arquero = new Arqueros();
                    arquero.setCosto6(1000);
                    Mago mago = new Mago();
                    mago.setCosto3(2000);
                    MinaOroE oro1 = new MinaOroE();
                    oro1.setRecolector(10000);
                    oro1.setCosto1(2000);
                    MinaElixirE elixir2 = new MinaElixirE();
                    elixir2.setRecolector0(5000);
                    elixir2.setCosto2(2000);
                    ElixirOscuroE oscuro2 = new ElixirOscuroE();
                    oscuro2.setrecolector1(3000);
                    oscuro2.setCosto0(2500);
                    Avionetas avioneta = new Avionetas();
                    avioneta.setCosto5(1000);
                    Elefantes elefante = new Elefantes();
                    elefante.setCosto4(900);
                    
                    System.out.println("Tus recursos son: ");
                    System.out.println("Oro: "+oro1.getRecolector());
                    System.out.println("Elixir: "+elixir2.getRecolector0());
                    System.out.println("Elixir Oscuro: "+oscuro2.getrecolector1());
                    
                    while( valor2 != 4){
                        System.out.println("Se escogio la raza Elfos ");
                        System.out.println("1. Milicias");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir \n");
                        
                        valor2 = leer4.nextInt();
                        
                        switch(valor2){
                            case 1:
                                int g = 5;
                                Scanner leer5 = new Scanner(System.in);
                                
                                while(g != 3){
                                    System.out.println("Que desea entrenar jefe? ");
                                    System.out.println("1. Arquero cuesta 1000 elixir");
                                    System.out.println("2. Mago que es un Super soldado cuesta 2000 elixir oscuro");
                                    System.out.println("3. Salir \n");
                                    
                                    g = leer5.nextInt();
                                    
                                    switch(g){
                                        case 1:
                                            System.out.println("Oro: "+oro1.getRecolector());
                                            System.out.println("Elixir: "+(elixir2.getRecolector0()-arquero.getCosto6()));
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factory7;
                                            factory7 = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos Arqueros = factory7.getjugarElfos("Arquero");
                                            Arqueros.atacar();
                                            break;
                                        case 2:
                                            System.out.println("Oro: "+oro1.getRecolector());
                                            System.out.println("Elixir: "+elixir2.getRecolector0());
                                            System.out.println("Elixir oscuro: "+(oscuro2.getrecolector1()-mago.getCosto3()));
                                            AbstractFactory factory9;
                                            factory9 = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos Mago = factory9.getjugarElfos("Mago");
                                            Mago.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo de este bloque...");
                                            break;
                                        default:
                                            System.out.println("Escogio: " + g + "Eliga una opcion valida.");
                                    }
                                }
                                break;
                            case 2:
                                int h = 5;
                                Scanner leer7 = new Scanner(System.in);
                                
                                while (h != 4){
                                    System.out.println("Usted eligio crear una edificacion: ");
                                    System.out.println("1. Mina de Oro costo: 2000 oro");
                                    System.out.println("2. Mina de Elixir costo: 2000 oro");
                                    System.out.println("3. Mina de Elixir Oscuro costo 2500 oro");
                                    System.out.println("4. Salir \n");
                                    
                                    h = leer7.nextInt();
                                    
                                    switch(h){
                                        case 1:
                                            System.out.println("Oro: "+(oro1.getRecolector()-oro1.getCosto1()));
                                            System.out.println("Elixir: "+elixir2.getRecolector0());
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factory0;
                                            factory0 = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos MinaOro = factory0.getjugarElfos("MinaOro");
                                            MinaOro.recolectar();
                                            break;
                                        case 2:
                                            System.out.println("Oro: "+(oro1.getRecolector()-elixir2.getCosto2()));
                                            System.out.println("Elixir: "+elixir2.getRecolector0());
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factory;
                                            factory = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos MinaElixir = factory.getjugarElfos("MinaElixir");
                                            MinaElixir.recolectar();
                                            break;
                                        case 3:
                                            System.out.println("Oro: "+(oro1.getRecolector()-oscuro2.getCosto0()));
                                            System.out.println("Elixir: "+elixir2.getRecolector0());
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factory1;
                                            factory1 = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos ElixirOscuro = factory1.getjugarElfos("ElixirOscuro");
                                            ElixirOscuro.recolectar();
                                            break;
                                        case 4:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Eligio la opcion: "+ h +"Eliga una valida.");
                                    }
                                }
                                break;
                            case 3:
                                int i = 4;
                                Scanner leer0 = new Scanner(System.in);
                                
                                while(i != 3){
                                    System.out.println("Que vehiculo de guerra desea contruir? \n");
                                    System.out.println("1. Avionetas costo: 1000 elixir");
                                    System.out.println("2. Elefantes costo: 900 elixir");
                                    System.out.println("3. Salir \n");
                                    
                                    i = leer0.nextInt();
                                    
                                    switch(i){
                                        case 1:
                                            System.out.println("Oro: "+oro1.getRecolector());
                                            System.out.println("Elixir: "+(elixir2.getRecolector0()-avioneta.getCosto5()));
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factory;
                                            factory = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos Avionetas = factory.getjugarElfos("Avionetas");
                                            Avionetas.atacar();
                                            break;
                                        case 2:
                                            System.out.println("Oro: "+oro1.getRecolector());
                                            System.out.println("Elixir: "+(elixir2.getRecolector0()-elefante.getCosto4()));
                                            System.out.println("Elixir oscuro: "+oscuro2.getrecolector1());
                                            AbstractFactory factor;
                                            factor = FactoryProducer.getFactory("jugarElfos");
                                            jugarElfos Elefantes = factor.getjugarElfos("Elefantes");
                                            Elefantes.atacar();
                                            break;
                                        case 3:
                                            System.out.println("Saliendo de este bloque");
                                            break;
                                        default:
                                            System.out.println("Ingreso: "+ i +" Ingrese una opcion valida.");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Saliendo de este bloque.");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Adios saliendo del sistema.");
                    break;
            }
        }
    }
}
