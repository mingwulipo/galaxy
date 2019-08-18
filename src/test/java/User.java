import lombok.Builder;
import lombok.Data;

/**
 * Created by Administrator on 2019\8\18 0018.
 */
@Data
@Builder
public class User {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        User user = new User.UserBuilder().age(1).name("lipo").build();
        System.out.println(user);
    }
}
