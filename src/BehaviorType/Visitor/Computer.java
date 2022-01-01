package BehaviorType.Visitor;

/**
 * @Author zzguo
 * @Description 电脑 对电脑部件类进行 操作 却又不希望 修改 这些类
 * @Date 2022/1/1
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}