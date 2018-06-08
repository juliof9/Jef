package ClasesAbstractas;

import Aliens.FactoryAliens;
import Elfos.FactoryElfos;
import Humanos.FactoryHumanos;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "jugarEflos":
                return new FactoryElfos();
            case "jugarHumanos":
                return new FactoryHumanos();
            case "jugarAliens":
                return new FactoryAliens();
        }
        return null;
    }
}
