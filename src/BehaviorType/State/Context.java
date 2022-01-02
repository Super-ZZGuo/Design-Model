package BehaviorType.State;

/**
 * @Author zzguo
 * @Description 具有开、关两个状态的某个类
 * @Date 2022/1/2
 **/
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void start() {
        getState().start(this);
    }

    public void close() {
        getState().close(this);
    }
}
