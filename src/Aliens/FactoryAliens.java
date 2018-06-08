package Aliens;

import ClasesAbstractas.AbstractFactory;
import Elfos.jugarElfos;
import Humanos.jugarHumanos;

public class FactoryAliens implements AbstractFactory{
    @Override
    public jugarAliens getjugarAliens(String type){
        switch(type){
            case "Depredadores":
                return new Depredadores();
            case "Naves":
                return new Naves();
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
