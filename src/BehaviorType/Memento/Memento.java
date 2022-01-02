package BehaviorType.Memento;

/**
 * @Author zzguo
 * @Description 备忘录
 * @Date 2022/1/2
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
