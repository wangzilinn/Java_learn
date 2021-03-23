package hotreload;

import java.time.LocalDateTime;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/23/2021 10:33 AM
 */
public class ManagerImpl implements BaseManager {


    public ManagerImpl() {
    }

    @Override
    public void logic() {
        System.out.println(LocalDateTime.now() + "原始类ho");
    }
}
