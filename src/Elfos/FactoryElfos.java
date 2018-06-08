package Elfos;

import Aliens.jugarAliens;
import ClasesAbstractas.AbstractFactory;
import Humanos.jugarHumanos;

public class FactoryElfos implements AbstractFactory{

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
            case "Duende":
                return new Duende();
        }
        return null;
    }

    @Override
    public jugarHumanos getjugarHumanos(String type) {
        return null;
    }
    
    
}
