package StructureType.Bridge;

/**
 * @Author zzguo
 * @Description 客户端/用户
 * @Date 2021/12/28
 **/
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControlXiaomi = new RemoteControlXiaomi(new Sony());
        remoteControlXiaomi.on();
        remoteControlXiaomi.off();
        remoteControlXiaomi.tuneChannel();
    }
}