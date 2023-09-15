package by.terrapizza.aut.util;

public class Waiters {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
