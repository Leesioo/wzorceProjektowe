package builder;

public class Burger {
    private final BreadType type;
    private final String rodzajMiesa;
    private final String rodzajSalaty;
    private final String rodzajSera;
    private final String rodzajSosy;
    private boolean zawieraBekon;

    public static class Builder {

        private BreadType type;
        private String rodzajMiesa;
        private String rodzajSalaty;
        private String rodzajSera;
        private String rodzajSosy;
        private boolean zawieraBekon;

        public Builder() {
        }

        public Burger build() {
            return new Burger(this);
        }

        public Builder zawieraBekon(boolean zawieraBekon) {
            this.zawieraBekon = zawieraBekon;
            return this;
        }

        public Builder type(BreadType type) {
            this.type = type;
            return this;
        }
        public Builder rodzajMiesa(String rodzajMiesa) {
            this.rodzajMiesa = rodzajMiesa;
            return this;
        }

        public Builder rodzajSalaty(String rodzajSalaty) {
            this.rodzajSalaty = rodzajSalaty;
            return this;
        }

        public Builder rodzajSera(String rodzajSera) {
            this.rodzajSera = rodzajSera;
            return this;
        }

        public Builder rodzajSosy(String rodzajSosy) {
            this.rodzajSosy = rodzajSosy;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private Burger(Builder builder) {
        this.type = builder.type;
        this.rodzajMiesa = builder.rodzajMiesa;
        this.rodzajSalaty = builder.rodzajSalaty;
        this.rodzajSera = builder.rodzajSera;
        this.rodzajSosy = builder.rodzajSosy;
        this.zawieraBekon = builder.zawieraBekon;
    }

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
