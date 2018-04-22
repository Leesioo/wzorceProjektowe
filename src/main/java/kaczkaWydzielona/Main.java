package kaczkaWydzielona;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstrakcyjnaKaczka> lista = new ArrayList<>();
        KaczkaKrzyzowka krzyzowka = new KaczkaKrzyzowka();
        lista.add(krzyzowka);
        CyraneczkaKarolinska cyraneczka = new CyraneczkaKarolinska();
        lista.add(cyraneczka);
        GumowaKaczuszka gumowa = new GumowaKaczuszka();
        lista.add(gumowa);
        for (AbstrakcyjnaKaczka kaczka : lista) {
            kaczka.kwacz();
            kaczka.lataj();
            kaczka.plywaj();
        }
    }
}
