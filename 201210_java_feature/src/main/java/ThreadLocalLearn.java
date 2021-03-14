/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/13/2021 9:22 PM
 */
public class ThreadLocalLearn {
    public static void main(String[] args) {
        ThreadLocal<Cat> threadLocal = new ThreadLocal<>();
        for (int i = 0; i < 2; i++) {
            int finalI = i;
            new Thread(() -> {
                threadLocal.set(new Cat());
                if (finalI == 0) {
                    threadLocal.get().setSay("111");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (finalI == 1) {
                    threadLocal.get().setSay("222");
                }
                System.out.println("threadLocal.get().getSay() = " + threadLocal.get().getSay());
            }).start();
        }
    }

}
