package share.chapter3;

/**
 * @author guang
 * @since 2019/9/7 12:52 下午
 */
public class KotlinObject {
    public static void main(String[] args) {
        HelloObject helloObject = HelloObject.INSTANCE;
        String world = helloObject.hello("world");
    }
}


