package BehaviorType.Mediator;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2022/1/2
 **/
public class Client {
    public static void main(String[] args) {
        User robert = new User("小明");
        User john = new User("小红");

        robert.sendMessage("你好小红👋!");
        john.sendMessage("你好呀 小明!");
    }
}
