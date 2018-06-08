package Humanos;

import Aliens.jugarAliens;
import ClasesAbstractas.AbstractFactory;
import Elfos.jugarElfos;

public class FactoryHumanos implements AbstractFactory{
    
    @Override
    public jugarElfos getjugarElfos(String type){
        return null;
    }
    
    @Override
    public jugarAliens getjugarAliens(String type){
        return null;
    }
    
    @Override
    public jugarHumanos getjugarHumanos(String type){
        switch(type){
            case "Tanque":
                return new Tanque();
            case "Avion":
                return new Avion();
            case "Peloton":
                return new Peloton();
        }
        return null;
    }
}
