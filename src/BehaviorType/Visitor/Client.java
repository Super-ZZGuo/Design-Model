package BehaviorType.Visitor;

/**
 * @Author zzguo
 * @Description 客户端 查看电脑组成 (说实话我怎么感觉访问者模式有点鸡肋。。。)
 * @Date 2022/1/1
 **/
public class Client {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
