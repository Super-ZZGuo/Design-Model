package StructureType.Bridge;

/**
 * @Author zzguo
 * @Description 控制器抽象子类 红米你也打钱！
 * @Date 2021/12/28
 **/
public class RemoteControlRedmi extends RemoteControl {

    public RemoteControlRedmi(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("红米红外遥控 电视打开");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("红米红外遥控 电视关闭");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("红米红外遥控 电视换台");
        tv.tuneChannel();
    }
}