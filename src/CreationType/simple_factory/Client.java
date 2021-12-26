package CreationType.simple_factory;
/**
 * @Author zzguo
 * @Date 10:22 下午 2021/12/25
 **/

public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
