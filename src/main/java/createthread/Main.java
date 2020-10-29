package createthread;

/**
 * @author mingyu
 */
public class Main {

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        firstTask.start();

        Thread thread = new Thread(new SecondTask());
        thread.start();
    }
}
