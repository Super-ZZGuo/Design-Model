package BehaviorType.Strategy;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2022/1/2
 **/
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        // 切换策略为 嘎嘎叫
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        // 切换策略为 呱呱叫
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
