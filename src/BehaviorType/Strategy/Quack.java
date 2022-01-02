package BehaviorType.Strategy;

/**
 * @Author zzguo
 * @Description 呱呱叫
 * @Date 2022/1/2
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱！");
    }
}