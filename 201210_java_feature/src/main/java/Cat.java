import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/10/2020 8:24 PM
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class Cat extends Animal {
    private String say = "mmmmmm";
}
