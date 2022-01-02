package BehaviorType.Strategy;

/**
 * @Author zzguo
 * @Description 鸭子类
 * @Date 2022/1/2
 **/
public class Duck {
    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
