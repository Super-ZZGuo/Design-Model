package BehaviorType.TemplateMethod;

/**
 * @Author zzguo
 * @Description 喝咖啡行为 重写brew addCondiments非共性行为
 * @Date 2021/12/31
 **/
public class DrinkCoffee extends DrinkBeverage{

    @Override
    void brew() {
        System.out.println("冲泡 咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("添加 咖啡调味品");
    }
}
