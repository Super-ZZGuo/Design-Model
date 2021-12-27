package CreationType.abstract_factory;
/**
 * @Author zzguo
 * @Description 用户
 * @Date 12:03 上午 2021/12/27
 **/
public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        // do something with productA and productB
    }
}
