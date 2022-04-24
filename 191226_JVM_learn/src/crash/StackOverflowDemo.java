package crash;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 4/24/2022 9:50 PM
 */
public class StackOverflowDemo {
    public static void main(String[] args) {
        main(new String[]{});
    }
}
