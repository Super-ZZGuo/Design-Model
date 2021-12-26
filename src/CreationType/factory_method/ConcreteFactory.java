package CreationType.factory_method;
/*
@date 2021/12/26 - 12:45 下午
*/

import CreationType.simple_factory.ConcreteProduct;
import CreationType.simple_factory.Product;

public class ConcreteFactory extends Factory{

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
