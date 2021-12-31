package BehaviorType.TemplateMethod;

/**
 * @Author zzguo
 * @Description 行为模版 喝饮料; 共性部分为 boilWater、pourInCup 两个动作
 * @Date 2021/12/31
 **/
public abstract class DrinkBeverage {

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("倒入水");
    }
    void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 模版
    final void prepareRecipe() {
        // 倒水
        boilWater();

        // 冲泡
        brew();

        // 倒入杯中
        pourInCup();

        // 添加调味品
        addCondiments();
    }
}
