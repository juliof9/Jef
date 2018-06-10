package ClasesAbstractas;

import Aliens.CuartelAliens;
import Elfos.CuartelElfos;
import Humanos.CuartelHumanos;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "jugarEflos":
                return new CuartelElfos();
            case "jugarHumanos":
                return new CuartelHumanos();
            case "jugarAliens":
                return new CuartelAliens();
        }
        return null;
    }
}
