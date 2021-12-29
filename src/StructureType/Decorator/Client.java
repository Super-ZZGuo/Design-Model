package StructureType.Decorator;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/29
 **/
public class Client {

    public static void main(String[] args) {
        // 奶茶为被装饰者 奶盖、布丁为装饰者
        // 往 奶茶 中加入 奶盖、布丁
        Beverage beverage = new MilkyTea();
        beverage = new MilkCover(beverage);
        beverage = new Pudding(beverage);
        System.out.println(beverage.cost());
    }
}
