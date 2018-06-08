package ClasesAbstractas;

import Aliens.jugarAliens;
import Elfos.jugarElfos;
import Humanos.jugarHumanos;

public interface AbstractFactory {
    jugarAliens getjugarAliens(String type);
    jugarElfos getjugarElfos(String type);
    jugarHumanos getjugarHumanos(String type);
}
