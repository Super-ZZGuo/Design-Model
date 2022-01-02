package BehaviorType.Memento;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2022/1/2
 **/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        // 保存状态 #2 进备忘录
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");

        // 保存状态 #3 进备忘录
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        // 输出当前状态
        System.out.println("Current State: " + originator.getState());

        // 恢复到 #2
        originator.getStateFromMemento(careTaker.get(0));

        // 输出当前状态
        System.out.println("First saved State: " + originator.getState());

        // 恢复到 #3
        originator.getStateFromMemento(careTaker.get(1));

        // 输出当前状态
        System.out.println("Second saved State: " + originator.getState());

    }
}
