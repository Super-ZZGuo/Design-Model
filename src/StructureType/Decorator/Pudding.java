package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description Pudding 具体装饰者 布丁 价格3
 * @Date 2021/12/29
 **/
public class Pudding extends CondimentDecorator {

    public Pudding(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        System.out.println("您已添加布丁，价格为3");
        return 3 + beverage.cost();
    }
}
