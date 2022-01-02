package BehaviorType.Memento;

/**
 * @Author zzguo
 * @Description 备忘录状态保存类
 * @Date 2022/1/2
 **/
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
