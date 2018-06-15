package Elfos;

import Aliens.jugarAliens;
import ClasesAbstractas.AbstractFactory;
import Humanos.jugarHumanos;

public class CuartelElfos implements AbstractFactory{
    public static int life = 1500;
    @Override
    public jugarAliens getjugarAliens(String type) {
        return null;
    }

    @Override
    public jugarElfos getjugarElfos(String type) {
        switch(type){
            case "Arquero":
                return new Arqueros();
            case "Mago":
                return new Mago();
            case "MinaOro":
                return new MinaOroE();
            case "MinaElixir":
                return new MinaElixirE();
            case "Elefantes":
                return new Elefantes();
            case "Avionetas":
                return new Avionetas();
            case "ElixirOscuro":
                return new ElixirOscuroE();
        }
        return null;
    }

    @Override
    public jugarHumanos getjugarHumanos(String type) {
        return null;
    }
    
    
}
