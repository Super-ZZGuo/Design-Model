package BehaviorType.Mediator;

/**
 * @Author zzguo
 * @Description 用户
 * @Date 2022/1/2
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
