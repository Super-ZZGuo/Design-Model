package BehaviorType.Visitor;

/**
 * @Author zzguo
 * @Description 键盘
 * @Date 2022/1/1
 **/
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
