package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description 被装饰者 奶茶
 * @Date 2021/12/29
 **/
public class MilkyTea implements Beverage{
    public MilkyTea(){
        System.out.println("您已选择奶茶,价格为" + cost());
    }
    @Override
    public double cost() {
        return 10;
    }
}
