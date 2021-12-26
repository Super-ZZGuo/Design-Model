package CreationType.factory_method;
/*
@date 2021/12/26 - 12:40 下午
*/

import CreationType.simple_factory.Product;

public abstract class Factory {
    abstract public Product factoryMethod();


    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}

