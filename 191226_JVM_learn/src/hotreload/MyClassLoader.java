package hotreload;

import java.io.*;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 10:10 AM
 */
public class MyClassLoader extends ClassLoader {
    private final String classPath;

    public MyClassLoader(String classPath) {
        //指定父类加载器
        super(ClassLoader.getSystemClassLoader());
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] data = this.loadClassData(name);
        return this.defineClass("hotreload.ManagerImpl", data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        try {
            name = name.replace(".", "\\");
            FileInputStream fileInputStream = new FileInputStream(new File(classPath + name + ".class"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int b = 0;
            while ((b = fileInputStream.read()) != -1) {
                byteArrayOutputStream.write(b);
            }
            fileInputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
