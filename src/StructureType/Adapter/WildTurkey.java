package StructureType.Adapter;

/**
 * @Author zzguo
 * @Description 野生火鸡(Turkey实现类)
 * @Date 12:13 上午 2021/12/28
 **/
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
