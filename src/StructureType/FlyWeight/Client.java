package StructureType.FlyWeight;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/30
 **/
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        // 两个享元对象hashcode相同 说明享元对象共用一个内部状态 "aa"
        // 此处例子实在FlyweightFactory 内通过HashMap来记录是否存在 "aa"
        Flyweight flyweight1 = factory.getFlyweight("aa");
        Flyweight flyweight2 = factory.getFlyweight("aa");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
