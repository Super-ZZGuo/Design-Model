package BehaviorType.Observer;

/**
 * @Author zzguo
 * @Description 气象站
 * @Date 2021/12/31
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 创建(注册) 观察者
        Display1 display1 = new Display1(weatherData);
        // 创建(注册) 观察者
        Display2 display2 = new Display2(weatherData);

        // 天气参数修改
        weatherData.setMeasurements(37, 50, 20);
        weatherData.setMeasurements(42, 60, 30);
        // 移除 display2 观察者
        weatherData.removeObserver(display2);
        weatherData.setMeasurements(45, 70, 40);
    }
}