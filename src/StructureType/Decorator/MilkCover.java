package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description MilkCover 具体装饰者 奶盖 价格4
 * @Date 2021/12/29
 **/
public class MilkCover extends CondimentDecorator {

    public MilkCover(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        System.out.println("您已添加奶盖，价格为4");
        return 4 + beverage.cost();
    }
}
