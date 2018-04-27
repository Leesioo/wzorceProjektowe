package homeworks.level2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadRunner());
        Thread thread2 = new Thread(new ThreadRunner());
        thread1.start();
        thread2.start();
    }
}
