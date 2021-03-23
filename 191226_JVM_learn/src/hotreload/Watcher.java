package hotreload;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 11:01 AM
 */
public class Watcher implements Runnable {

    @Override
    public void run() {
        while (true) {
            BaseManager manager = ManagerFactory.getManager(ManagerFactory.MANAGER_NAME);
            manager.logic();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
