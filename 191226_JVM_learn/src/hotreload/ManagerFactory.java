package hotreload;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 10:39 AM
 */
public class ManagerFactory {
    public static final Map<String, LoadInfo> loadTimeMap = new HashMap<>();

    public static final String CLASS_PATH = "D:\\Case\\191226_Java_learn\\191226_JVM_learn\\out\\production\\191226_JVM_learn\\" +
            "hotreload\\";
    public static final String MANAGER_NAME = "ManagerImpl";

    public static BaseManager getManager(String className) {
        File loadFile = new File(CLASS_PATH + className + ".class");
        long lastModified = loadFile.lastModified();
        System.out.println("当前类 lastModified = " + lastModified);
        if (loadTimeMap.get(className) == null) {
            // 如果该类没有被加载过, 直接加载
            load(className, lastModified);
        } else if (loadTimeMap.get(className).getLoadTime() != lastModified) {
            // 如果时间戳变化,则重新加载
            load(className, lastModified);
        }
        return loadTimeMap.get(className).getManager();
    }

    public static void load(String className, long lastModified) {
        MyClassLoader myClassLoader = new MyClassLoader(CLASS_PATH);
        Class loadClass = null;
        try {
            loadClass = myClassLoader.loadClass(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        BaseManager manager = newInstance(loadClass);
        LoadInfo loadInfo = new LoadInfo(myClassLoader, lastModified);
        loadInfo.setManager(manager);
        loadTimeMap.put(className, loadInfo);
    }

    private static BaseManager newInstance(Class loadClass) {
        try {
            return (BaseManager)loadClass.getConstructor().newInstance(new Object[]{});
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }


}
