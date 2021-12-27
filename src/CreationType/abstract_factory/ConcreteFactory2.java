package CreationType.abstract_factory;
/**
 * @Author zzguo
 * @Description 具体工厂2
 * @Date 12:03 上午 2021/12/27
 **/
public class ConcreteFactory2 extends AbstractFactory{
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
