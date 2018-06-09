package Humanos;

import Aliens.jugarAliens;
import ClasesAbstractas.AbstractFactory;
import Elfos.jugarElfos;

public class CuartelHumanos implements AbstractFactory{
    
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
            case "Francotirador":
                return new Francotirador();
            case "BancoOro":
                return new BancoOro();
            case "Elixir":
                return new Elixir();
        }
        return null;
    }
}
