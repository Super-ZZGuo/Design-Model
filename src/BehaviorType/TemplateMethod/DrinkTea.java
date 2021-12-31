package BehaviorType.TemplateMethod;

/**
 * @Author zzguo
 * @Description 喝茶行为 重写brew addCondiments非共性行为
 * @Date 2021/12/31
 **/
public class DrinkTea extends DrinkBeverage {

    @Override
    void brew() {
        System.out.println("冲泡 茶");
    }

    @Override
    void addCondiments() {
        System.out.println("添加 茶调味品");
    }
}
