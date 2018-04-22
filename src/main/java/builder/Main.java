package builder;

public class Main {
    public static void main(String[] args) {
        Burger.Builder burger = Burger.builder();
        Burger myBurger = burger.rodzajMiesa("surowe").rodzajSalaty("włoska").rodzajSera("zółty").rodzajSosy("czosnek").build();
        System.out.println(myBurger);
    }
}
