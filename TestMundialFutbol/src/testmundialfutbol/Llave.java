package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Llave extends EtapaMundial {

    public Llave() {
    }

    @Override
//
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> niupi = new ArrayList<>();
        // devuelve los equipos que pasan a la de llave
        for (Partido tenkai : getPartidos()) {
            if (tenkai.getResultado().ganoLocal()) {
                niupi.add(tenkai.getLocal());
            }
            if (tenkai.getResultado().ganoVisitante()) {
                niupi.add(tenkai.getVisitante());
            }
        }

        return niupi;
    }

}
