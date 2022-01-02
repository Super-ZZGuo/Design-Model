package BehaviorType.State;

/**
 * @Author zzguo
 * @Description 开始状态
 * @Date 2022/1/2
 **/
public class StartState implements State {
    public void start(Context context) {
    }

    public void close(Context context) {
        context.setState(new CloseState());//注意状态的切换
        System.out.println("close State");
    }
}


