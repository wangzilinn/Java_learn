package crash;

import java.util.HashMap;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:21 PM
 */
public class OOMDemo {
    static HashMap<Object, Object> myMap = new HashMap<>();

    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            myMap.put("key" + counter, "Large stringgggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + "ggggggggggggggggggggggggggggggggggggggggggggggggggggg"
                    + counter);
            counter++;
        }
    }
}
