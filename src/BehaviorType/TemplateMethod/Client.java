package BehaviorType.TemplateMethod;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/31
 **/
public class Client {

    public static void main(String[] args) {
        DrinkBeverage drinkBeverage1 = new DrinkCoffee();
        drinkBeverage1.prepareRecipe();

        System.out.println("-----------");

        DrinkBeverage drinkBeverage2 = new DrinkTea();
        drinkBeverage2.prepareRecipe();
    }
}
