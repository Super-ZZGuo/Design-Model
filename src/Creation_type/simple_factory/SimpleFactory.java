package Creation_type.simple_factory;/*
@date 2021/12/25 - 10:17 下午
*/

public class SimpleFactory {
    public Product createProduct(int num){
        switch (num){
            case 1: return new ConcreteProduct1();
            case 2: return new ConcreteProduct2();
            default: return new ConcreteProduct();
        }
    }
}
