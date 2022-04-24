/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/13/2021 9:22 PM
 */
public class ThreadLocalLearn {
    public static void main(String[] args) {
        // 注意:对于一个特定的对象, ThreadLocal一定是单例的
        ThreadLocal<Cat> threadLocal = new ThreadLocal<>();
        for (int i = 0; i < 2; i++) {
            int finalI = i;
            new Thread(() -> {
                // 为threadLocal设置对象,两个线程执行同样的操作
                threadLocal.set(new Cat());
                // 根据线程名的不同修改ThreadLocal中对象的动作
                if (finalI == 0) {
                    threadLocal.get().setSay("111");
                }
                if (finalI == 1) {
                    threadLocal.get().setSay("222");
                }
                // 使用同一行代码,在两个线程中可以产生不同的动作
                System.out.println("threadLocal.get().getSay() = " + threadLocal.get().getSay());
            }).start();
        }
    }
}
