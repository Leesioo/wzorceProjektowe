package paragon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recip.Builder recip = Recip.builder();
        List<Position> lista = new ArrayList<>();
        lista.add(new Position("buła", 1.12, StawkiVat.STAWKA_8));
        lista.add(new Position("mięcho", 3, StawkiVat.STAWKA_23));
        lista.add(new Position("sałata", 0.56, StawkiVat.STAWKA_23));
        lista.add(new Position("sosik", 0.12, StawkiVat.STAWKA_8));
        lista.add(new Position("przyprawy", 0.05, StawkiVat.STAWKA_5));
        Position produkt = new Position("cokolwiek", 2.4, StawkiVat.STAWKA_5);
        Recip myRecip = recip.withProducts(lista).withProduct(produkt).build();
        System.out.println(myRecip);
    }
}
