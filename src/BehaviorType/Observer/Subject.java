package BehaviorType.Observer;

/**
 * @Author zzguo
 * @Description 接口 主题
 * @Date 2021/12/31
 **/
public interface Subject {

    // 注册观察者
    void resisterObserver(Observer o);
    // 移除观察者
    void removeObserver(Observer o);
    // 通知观察者
    void notifyObserver();
}
