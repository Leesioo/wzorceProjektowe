package kaczkaWydzielona;

public class KaczkaKrzyzowka extends AbstrakcyjnaKaczka {
    public KaczkaKrzyzowka() {
        super(new LatanieNaSkrzydlach(), new StandardowePlywanie(), new StandardoweKwakanie());
    }
}
