package CreationType.factory_method;
/*
@date 2021/12/26 - 12:55 下午
*/


import CreationType.simple_factory.ConcreteProduct2;
import CreationType.simple_factory.Product;

public class ConcreteFactory2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
