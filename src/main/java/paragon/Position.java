package paragon;

import java.nio.file.StandardOpenOption;

public class Position {
    private String nazwaProduktu;
    private double cenaNetto;
    private StawkiVat stawkaVat;

    public Position(String nazwaProduktu, double cenaNetto, StawkiVat stawkaVat) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaNetto = cenaNetto;
        this.stawkaVat = stawkaVat;
    }

    @Override
    public String toString() {
        return "Position{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", stawkaVat=" + stawkaVat +
                '}';
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public StawkiVat getStawkaVat() {
        return stawkaVat;
    }
}
