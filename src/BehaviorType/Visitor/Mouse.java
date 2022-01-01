package BehaviorType.Visitor;

/**
 * @Author zzguo
 * @Description 鼠标
 * @Date 2022/1/1
 **/
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}