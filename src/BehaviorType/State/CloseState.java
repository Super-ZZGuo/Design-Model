package BehaviorType.State;

/**
 * @Author zzguo
 * @Description 关闭状态
 * @Date 2022/1/2
 **/
public class CloseState implements State {
    public void start(Context context) {
        context.setState(new StartState());//注意状态的切换
        System.out.println("start State");
    }
    public void close(Context context) {
    }

}