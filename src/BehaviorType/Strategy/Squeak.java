package BehaviorType.Strategy;


/**
 * @Author zzguo
 * @Description 嘎嘎叫
 * @Date 2022/1/2
 **/
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎!");
    }
}
  
