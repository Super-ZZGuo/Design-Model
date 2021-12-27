package CreationType.abstract_factory;

/**
 * @Author zzguo
 * @Description 抽象工厂
 * @Date 12:02 上午 2021/12/27
 **/
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
