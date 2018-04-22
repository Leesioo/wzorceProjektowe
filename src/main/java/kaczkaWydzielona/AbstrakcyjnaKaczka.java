package kaczkaWydzielona;

import kaczka.Kaczka;

public abstract class AbstrakcyjnaKaczka implements Kaczka {
    private Latajacy latajacy;
    private Plywajacy plywajacy;
    private Kwaczacy kwaczacy;

    protected AbstrakcyjnaKaczka(Latajacy latajacy, Plywajacy plywajacy, Kwaczacy kwaczacy) {
        this.latajacy = latajacy;
        this.plywajacy = plywajacy;
        this.kwaczacy = kwaczacy;
    }

    public Latajacy getLatajacy() {
        return latajacy;
    }

    @Override
    public void plywaj() {
        plywajacy.plywaj();
    }

    @Override
    public void kwacz() {
        kwaczacy.kwacz();
    }

    @Override
    public void lataj() {
        latajacy.lataj();
    }

    public void setLatajacy(Latajacy latajacy) {
        this.latajacy = latajacy;
    }

    public Plywajacy getPlywajacy() {
        return plywajacy;
    }

    public void setPlywajacy(Plywajacy plywajacy) {
        this.plywajacy = plywajacy;
    }

    public Kwaczacy getKwaczacy() {
        return kwaczacy;
    }

    public void setKwaczacy(Kwaczacy kwaczacy) {
        this.kwaczacy = kwaczacy;
    }
}
