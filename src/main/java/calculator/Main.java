package calculator;

public class Main {
    public static void main(String[] args) {
//        Dodawanie dodawanie = ;
//        Odejmowanie odejmowanie = ;
//        Mnozenie mnozenie = ;
//        Dzielenie dzielenie = ;

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(new Dodawanie(), 4, 5));
        System.out.println(calculator.calculate(new Odejmowanie(), 4, 5));
        System.out.println(calculator.calculate(new Mnozenie(), 4, 5));
        System.out.println(calculator.calculate(new Dzielenie(), 4, 5));
//        System.out.println(calculator.calculate(new Dzielenie(), 4, 0));
    }
}
