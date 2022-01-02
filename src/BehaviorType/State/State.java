package BehaviorType.State;

/**
 * @Author zzguo
 * @Description
 * @Date 2022/1/2 接口 状态
 **/
public interface State {
    public void start(Context context);
    public void close(Context context);
}
