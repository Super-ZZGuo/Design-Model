package CreationType.Prototype;

/**
 * @Author zzguo
 * @Description 克隆的具体实现对象
 * @Date 7:56 下午 2021/12/27
 **/
public class ConcretePrototype1 implements Prototype{
    public Prototype clone(){
        //最简单的克隆，新建一个自身对象,原型对象没有值，则不克隆值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
