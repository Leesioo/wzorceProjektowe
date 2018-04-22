package builder;

public class Burger {
    private BreadType type;
    private String rodzajMiesa;
    private String rodzajSalaty;
    private String rodzajSera;
    private String rodzajSosy;
    private boolean zawieraBekon;

    @Override
    public String toString() {
        return "Burger{" +
                "type=" + type +
                ", rodzajMiesa='" + rodzajMiesa + '\'' +
                ", rodzajSalaty='" + rodzajSalaty + '\'' +
                ", rodzajSera='" + rodzajSera + '\'' +
                ", rodzajSosy='" + rodzajSosy + '\'' +
                ", zawieraBekon=" + zawieraBekon +
                '}';
    }

    public BreadType getType() {
        return type;
    }

    public String getRodzajMiesa() {
        return rodzajMiesa;
    }

    public String getRodzajSalaty() {
        return rodzajSalaty;
    }

    public String getRodzajSera() {
        return rodzajSera;
    }

    public String getRodzajSosy() {
        return rodzajSosy;
    }

    public boolean isZawieraBekon() {
        return zawieraBekon;
    }
}
