package kaczka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kaczka> lista = new ArrayList<>();
        KaczkaKrzyzowka krzyzowka = new KaczkaKrzyzowka();
        lista.add(krzyzowka);
        CyraneczkaKarolinska cyraneczka = new CyraneczkaKarolinska();
        lista.add(cyraneczka);
        GumowaKaczuszka gumowa = new GumowaKaczuszka();
        lista.add(gumowa);
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).kwacz();
            lista.get(i).lataj();
            lista.get(i).plywaj();
        }
    }
}
