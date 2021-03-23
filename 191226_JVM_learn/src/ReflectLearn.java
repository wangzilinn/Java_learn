import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.lang.ClassLoader;
public class ReflectLearn {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        // String name = "\uD840\uDC60";
        // System.out.println(System.getProperty("file.encoding"));
        // byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        // System.out.println(name.getBytes(StandardCharsets.UTF_8).length);
        // char[] chars =name.toCharArray();
        // for (int i = 0; i < chars.length; i++) {
        //     System.out.println(chars[i]);
        // }

        // // 方法反射
        // Method eat = Person.class.getMethod("eat", String.class);
        // // 利用 invoke 方法调用方法
        // eat.invoke(new Person(), "food");
        // eat.invoke(new Person(), "food");
        // Method shit = Person.class.getMethod("shit", String.class);
        // shit.invoke(new Person(), "shit");

        //创建字符串"Hello World"， 并赋给引用s
        String s = "Hello World";

        System.out.println("s = " + s); //Hello World

        //获取String类中的value字段
        Field valueFieldOfString = String.class.getDeclaredField("value");

        //改变value属性的访问权限
        valueFieldOfString.setAccessible(true);

        //获取s对象上的value属性的值
        byte[] value = (byte[]) valueFieldOfString.get(s);

        //改变value所引用的数组中的第5个字符
        value[5] = '_';

        System.out.println("s = " + s);  //Hello_World

        String a = "1133";

    }
}
