package hotreload;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 11:05 AM
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Watcher()).start();
    }
}
