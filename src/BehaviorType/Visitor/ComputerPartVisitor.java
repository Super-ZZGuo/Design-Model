package BehaviorType.Visitor;/*
@date 2022/1/1 - 3:42 下午
*/

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
}
