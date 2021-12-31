package BehaviorType.Command;

/**
 * @Author zzguo
 * @Description 命令接受者 灯
 * @Date 2021/12/31
 **/
public class Light {
    // action
    public void on() {
        System.out.println("Light is on!");
    }

    // action
    public void off() {
        System.out.println("Light is off!");
    }
}
