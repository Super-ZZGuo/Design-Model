package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description 被装饰者 红茶
 * @Date 2021/12/29
 **/
public class BlackTea implements Beverage{
    public BlackTea(){
        System.out.println("您已选择红茶,价格为"+cost());
    }
    @Override
    public double cost() {
        return 8;
    }
}
