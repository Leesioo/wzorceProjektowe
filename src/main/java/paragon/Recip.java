package paragon;

import java.util.List;

import static paragon.StawkiVat.STAWKA_0;

public class Recip {
    private final List<Position> lista;
    private double sumaNettoStawka0;
    private double sumaBruttoStawka0;
    private double sumaNettoStawka5;
    private double sumaBruttoStawka5;
    private double sumaNettoStawka8;
    private double sumaBruttoStawka8;
    private double sumaNettoStawka23;
    private double sumaBruttoStawka23;

    public static class Builder {

        private List<Position> lista;
        private double sumaNettoStawka0;
        private double sumaBruttoStawka0;
        private double sumaNettoStawka5;
        private double sumaBruttoStawka5;
        private double sumaNettoStawka8;
        private double sumaBruttoStawka8;
        private double sumaNettoStawka23;
        private double sumaBruttoStawka23;

        public Builder() {
        }

        public Recip build() {
            for (int i = 0; i < lista.size(); i++) {
                switch (lista.get(i).getStawkaVat()) {
                    case STAWKA_0:
                        sumaNettoStawka0 += lista.get(i).getCenaNetto();
                        break;
                    case STAWKA_5:
                        sumaNettoStawka5 += lista.get(i).getCenaNetto();
                        break;
                    case STAWKA_8:
                        sumaNettoStawka8 += lista.get(i).getCenaNetto();
                        break;
                    case STAWKA_23:
                        sumaNettoStawka23 += lista.get(i).getCenaNetto();
                        break;
                }
            }
            sumaBruttoStawka0 = sumaNettoStawka0;
            sumaBruttoStawka5 = Math.floor(Math.round(sumaNettoStawka5 * 105))/100;
            sumaBruttoStawka8 = Math.floor(Math.round(sumaNettoStawka8 * 108))/100;
            sumaBruttoStawka23 = Math.floor(Math.round(sumaNettoStawka23 * 123))/100;

            return new Recip(this);
        }

        public Builder withProduct(Position product) {
            this.lista.add(product);
            return this;
        }

        public Builder withProducts(List<Position> lista) {
            this.lista = lista;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private Recip(Builder builder) {
        this.lista = builder.lista;
        this.sumaNettoStawka0 = builder.sumaNettoStawka0;
        this.sumaBruttoStawka0 = builder.sumaBruttoStawka0;
        this.sumaNettoStawka5 = builder.sumaNettoStawka5;
        this.sumaBruttoStawka5 = builder.sumaBruttoStawka5;
        this.sumaNettoStawka8 = builder.sumaNettoStawka8;
        this.sumaBruttoStawka8 = builder.sumaBruttoStawka8;
        this.sumaNettoStawka23 = builder.sumaNettoStawka23;
        this.sumaBruttoStawka23 = builder.sumaBruttoStawka23;
    }

    @Override
    public String toString() {
        return "Recip{" +
                "lista=" + lista +
                ", sumaNettoStawka0=" + sumaNettoStawka0 +
                ", sumaBruttoStawka0=" + sumaBruttoStawka0 +
                ", sumaNettoStawka5=" + sumaNettoStawka5 +
                ", sumaBruttoStawka5=" + sumaBruttoStawka5 +
                ", sumaNettoStawka8=" + sumaNettoStawka8 +
                ", sumaBruttoStawka8=" + sumaBruttoStawka8 +
                ", sumaNettoStawka23=" + sumaNettoStawka23 +
                ", sumaBruttoStawka23=" + sumaBruttoStawka23 +
                '}';
    }

    public List<Position> getLista() {
        return lista;
    }

    public double getSumaNettoStawka0() {
        return sumaNettoStawka0;
    }

    public double getSumaBruttoStawka0() {
        return sumaBruttoStawka0;
    }

    public double getSumaNettoStawka5() {
        return sumaNettoStawka5;
    }

    public double getSumaBruttoStawka5() {
        return sumaBruttoStawka5;
    }

    public double getSumaNettoStawka8() {
        return sumaNettoStawka8;
    }

    public double getSumaBruttoStawka8() {
        return sumaBruttoStawka8;
    }

    public double getSumaNettoStawka23() {
        return sumaNettoStawka23;
    }

    public double getSumaBruttoStawka23() {
        return sumaBruttoStawka23;
    }
}
