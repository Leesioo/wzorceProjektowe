package kaczkaWydzielona;

public class GumowaKaczuszka extends AbstrakcyjnaKaczka {
    public GumowaKaczuszka() {
        super(new NieLatajacy(), new Dryfowanie(), new Piszczenie());
    }
}
