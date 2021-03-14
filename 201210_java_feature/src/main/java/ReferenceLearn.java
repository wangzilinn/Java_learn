import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/10/2020 4:52 PM
 */

public class ReferenceLearn {
    public static void main(String[] args) {
        String str = new String("abc");
        ReferenceQueue queue = new ReferenceQueue();
        // 创建虚引用，要求必须与一个引用队列关联
        PhantomReference pr = new PhantomReference(str, queue);
    }
}
