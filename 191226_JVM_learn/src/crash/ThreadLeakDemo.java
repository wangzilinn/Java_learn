package crash;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:44 PM
 */
public class ThreadLeakDemo {
    public static void main(String[] args) {
        while (true) {
            new ForeverThread().start();
        }
    }
    public static class ForeverThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                }catch (Exception e){}
            }
        }
    }
}
