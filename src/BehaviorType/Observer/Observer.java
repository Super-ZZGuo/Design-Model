package BehaviorType.Observer;

/**
 * @Author zzguo
 * @Description 接口 观察者
 * @Date 2021/12/31
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
