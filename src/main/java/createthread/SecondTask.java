package createthread;

/**
 * @author mingyu
 */
public class SecondTask implements Runnable {

    @Override
    public void run() {
        System.out.println("execute second task!!!");
    }
}
