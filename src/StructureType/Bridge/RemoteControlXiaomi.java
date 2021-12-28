package StructureType.Bridge;

/**
 * @Author zzguo
 * @Description 控制器抽象子类 小米打钱！
 * @Date 2021/12/28
 **/
public class RemoteControlXiaomi extends RemoteControl {

    public RemoteControlXiaomi(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("小米红外遥控 电视打开");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("小米红外遥控 电视关闭");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("小米红外遥控 电视换台");
        tv.tuneChannel();
    }
}