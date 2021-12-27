package StructureType.Adapter;

/**
 * @Author zzguo
 * @Description Turkey适配Duck
 * @Date 12:14 上午 2021/12/28
 **/
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // 重写quack方法
    @Override
    public void quack() {
        turkey.gobble();
    }
}
