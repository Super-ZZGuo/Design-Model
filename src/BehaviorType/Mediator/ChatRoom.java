package BehaviorType.Mediator;

import java.util.Date;

/**
 * @Author zzguo
 * @Description 中介者 聊天室
 * @Date 2022/1/2
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
