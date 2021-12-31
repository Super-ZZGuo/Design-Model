package BehaviorType.Command;

/**
 * @Author zzguo
 * @Description 开灯命令
 * @Date 2021/12/31
 **/
public class LightOffCommand implements Command{
    // 操作对象 灯
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
