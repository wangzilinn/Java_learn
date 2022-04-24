package crash;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Objects;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:26 PM
 */
public class HashMapLeakDemo {
    public static class Key{
        String title;

        public Key(String title) {
            this.title = title;
        }

        // @Override
        // public boolean equals(Object o) {
        //     if (this == o) return true;
        //     if (o == null || getClass() != o.getClass()) return false;
        //     Key key = (Key) o;
        //     return Objects.equals(title, key.title);
        // }
        //
        // @Override
        // public int hashCode() {
        //     return Objects.hash(title);
        // }
    }

    public static void main(String[] args) {
        HashMap<Key, Integer> keyIntegerHashMap = new HashMap<>();
        keyIntegerHashMap.put(new Key("1"), 1);
        keyIntegerHashMap.put(new Key("2"), 2);
        keyIntegerHashMap.put(new Key("3"), 3);

        Integer integer = keyIntegerHashMap.get(new Key("2"));
        System.out.println(integer);// null

    }
}
