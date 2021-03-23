package hotreload;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 10:34 AM
 */
public class LoadInfo {
    private MyClassLoader myClassLoader;

    private long loadTime;

    /**
     * 要加载的类
     */
    private BaseManager manager;

    public LoadInfo(MyClassLoader myClassLoader, long loadTime) {
        this.myClassLoader = myClassLoader;
        this.loadTime = loadTime;
    }

    public MyClassLoader getMyClassLoader() {
        return myClassLoader;
    }

    public void setMyClassLoader(MyClassLoader myClassLoader) {
        this.myClassLoader = myClassLoader;
    }

    public long getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(long loadTime) {
        this.loadTime = loadTime;
    }

    public BaseManager getManager() {
        return manager;
    }

    public void setManager(BaseManager manager) {
        this.manager = manager;
    }
}

