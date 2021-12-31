package BehaviorType.Command;

/**
 * @Author zzguo
 * @Description 遥控器
 * @Date 2021/12/31
 **/
public class Invoker {

    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum = 10;

    public Invoker() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    // 设置 对应(开启命令)位置上的 动作
    public void setOnCommand(Command command, int slot) {
        onCommands[slot] = command;
    }
    // 设置 对应(关闭命令)位置上的 动作
    public void setOffCommand(Command command, int slot) {
        offCommands[slot] = command;
    }
    //  启动 对应(开启命令)位置上的 动作
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    // 启动 对应(关闭命令)位置上的 动作
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
