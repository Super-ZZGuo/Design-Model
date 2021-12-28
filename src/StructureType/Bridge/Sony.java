package StructureType.Bridge;

/**
 * @Author zzguo
 * @Description TV抽象子类 Sony打钱！
 * @Date 2021/12/28
 **/
public class Sony extends TV{
    @Override
    public void on() {
        System.out.println("索尼电视打开");
    }

    @Override
    public void off() {
        System.out.println("索尼电视关闭");
    }

    @Override
    public void tuneChannel() {
        System.out.println("索尼电视换台");
    }
}
