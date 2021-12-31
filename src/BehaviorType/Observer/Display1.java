package BehaviorType.Observer;

/**
 * @Author zzguo
 * @Description 天气情况显示版一号
 * @Date 2021/12/31
 **/
public class Display1 implements Observer {

    public Display1(Subject weatherData) {
        weatherData.resisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("显示版一号更新为: " + temp + " " + humidity + " " + pressure);
    }
}