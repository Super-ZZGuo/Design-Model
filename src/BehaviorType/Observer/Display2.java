package BehaviorType.Observer;

/**
 * @Author zzguo
 * @Description 天气情况显示版二号
 * @Date 2021/12/31
 **/
public class Display2 implements Observer {

    public Display2(Subject weatherData) {
        weatherData.resisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("显示版二号更新为: " + temp + " " + humidity + " " + pressure);
    }
}