package createthread;

/**
 * @author mingyu
 */
public class Main {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("execute task from runnable!!!")) {
            @Override
            public void run() {
                System.out.println("execute task from thread!!!");
            }
        }.start();

//        FirstTask firstTask = new FirstTask();
//        firstTask.start();
//
//        Thread thread = new Thread(new SecondTask());
//        thread.start();
    }
}
