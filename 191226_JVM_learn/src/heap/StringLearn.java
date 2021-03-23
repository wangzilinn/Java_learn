package heap;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/12/2021 10:00 AM
 */
public class StringLearn {
    static String e;
    {
        e = "abc";
    }
    static String f = "abc";
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        String c = "abc";
        String d = "a" + "bc";
        System.out.println(a == e);
        System.out.println(a == f);
    }
}
