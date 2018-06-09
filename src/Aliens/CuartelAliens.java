package Aliens;

import ClasesAbstractas.AbstractFactory;
import Elfos.jugarElfos;
import Humanos.jugarHumanos;

public class CuartelAliens implements AbstractFactory{
    @Override
    public jugarAliens getjugarAliens(String type){
        switch(type){
            case "Depredadores":
                return new Depredadores();
            case "Aliens":
                return new Aliens();
            case "Naves":
                return new Naves();
            case "Omni":
                return new Omni(); 
            case "MinaOro":
                return new MinaOro();
            case "MinaElixir":
                return new MinaElixir();
        }
        return null;
    }
    
    @Override
    public jugarElfos getjugarElfos(String type){
        return null;
    }
    
    @Override
    public jugarHumanos getjugarHumanos(String type){
        return null;
    }
}
