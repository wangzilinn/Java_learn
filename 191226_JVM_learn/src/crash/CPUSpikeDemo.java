package crash;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:33 PM
 */
public class CPUSpikeDemo {
    public static void main(String[] args) {
        new CPUSpikerThread().start();
        new CPUSpikerThread().start();
        new CPUSpikerThread().start();
        new CPUSpikerThread().start();
        new CPUSpikerThread().start();
        new CPUSpikerThread().start();
        System.out.println("6 threads launched!");
    }

    public static class CPUSpikerThread extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
}
