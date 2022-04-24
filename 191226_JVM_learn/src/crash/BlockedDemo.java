package crash;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:51 PM
 */
public class BlockedDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new AppThread().start();
        }
    }
    public static class AppThread extends Thread {
        @Override
        public void run() {
            AppObject.getSomething();
        }
    }

    public static class AppObject{
        public static synchronized void getSomething() {
            while (true) {
                try {
                    Thread.sleep(60 * 10 * 1000);
                } catch (Exception e) {

                }
            }
        }
    }
}
