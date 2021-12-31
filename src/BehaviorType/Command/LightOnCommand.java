package BehaviorType.Command;

/**
 * @Author zzguo
 * @Description 关灯命令
 * @Date 2021/12/31
 **/
public class LightOnCommand implements Command{
    // 操作对象 灯
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
