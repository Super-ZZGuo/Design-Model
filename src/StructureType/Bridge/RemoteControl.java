package StructureType.Bridge;

/**
 * @Author zzguo
 * @Description 控制器抽象类 RemoteControl
 * @Date 2021/12/28
 **/
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}