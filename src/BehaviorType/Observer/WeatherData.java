package BehaviorType.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zzguo
 * @Description 天气数据
 * @Date 2021/12/31
 **/
public class WeatherData implements Subject {
    private List<Observer> observers;
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 压力
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    // 设置测量值
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void resisterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
}