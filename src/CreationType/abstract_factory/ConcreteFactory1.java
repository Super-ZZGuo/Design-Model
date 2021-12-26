package CreationType.abstract_factory;
/**
 * @Author zzguo
 * @Description 具体工厂1
 * @Date 12:03 上午 2021/12/27
 **/
public class ConcreteFactory1 extends AbstractFactory{
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
