package CreationType.factory_method;
/*
@date 2021/12/26 - 12:50 下午
*/


import CreationType.simple_factory.ConcreteProduct1;
import CreationType.simple_factory.Product;

public class ConcreteFactory1 extends Factory{

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
