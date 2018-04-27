package homeworks.level2;

public class ThreadRunner implements Runnable
{
    @Override
    public void run() {
        int counter = 0;
        while (counter < 10) {
            System.out.println(Thread.currentThread().getName() + " -> " + PropertyDoubleChecker.getInstance().getProperty("name"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            counter++;
        }
    }
}
