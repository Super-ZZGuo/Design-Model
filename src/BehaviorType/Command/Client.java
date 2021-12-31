package BehaviorType.Command;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/31
 **/
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        // 指定命令操作对象为 light
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        /***
         * 调用者 -> 命令 -> 接受者
         * invoker -> lightOnCommand / lightOffCommand -> light
         *
         *  请求以命令的形式包裹在对象中，并传给调用对象。
         *  调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令
         *  调用对象为 invoker
         *  处理命令合适对象为 lightOnCommand / lightOffCommand
         **/

        Invoker invoker = new Invoker();
        // 设立命令 以及 顺序
        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOnCommand(lightOnCommand, 1);
        invoker.setOnCommand(lightOnCommand, 2);
        invoker.setOffCommand(lightOffCommand, 0);
        invoker.setOffCommand(lightOffCommand, 1);
        invoker.setOffCommand(lightOffCommand, 2);

        // 启动 对应顺序上的 命令
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
        invoker.onButtonWasPushed(1);
        invoker.offButtonWasPushed(1);
        invoker.onButtonWasPushed(2);
        invoker.offButtonWasPushed(2);
    }
}
