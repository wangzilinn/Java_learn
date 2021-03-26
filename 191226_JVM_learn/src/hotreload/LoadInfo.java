package hotreload;

import hotreload.bean.Bean;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 10:34 AM
 */
public class LoadInfo {
    private ReloadClassLoader reloadClassLoader;
    private long loadTime;
    /**
     * 要加载的类
     */
    private Bean bean;

    public LoadInfo(ReloadClassLoader reloadClassLoader, long loadTime) {
        this.reloadClassLoader = reloadClassLoader;
        this.loadTime = loadTime;
    }

    public ReloadClassLoader getClassLoader() {
        return reloadClassLoader;
    }

    public void setMyClassLoader(ReloadClassLoader reloadClassLoader) {
        this.reloadClassLoader = reloadClassLoader;
    }

    public long getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(long loadTime) {
        this.loadTime = loadTime;
    }

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }
}

