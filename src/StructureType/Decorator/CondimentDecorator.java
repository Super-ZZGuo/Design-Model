package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description 装饰者，具体装饰者都会继承此类
 * @Date 2021/12/29
 * @Param
 * @return
 **/
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;
}
