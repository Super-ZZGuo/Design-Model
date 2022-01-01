package BehaviorType.Visitor;

/**
 * @Author zzguo
 * @Description 接口 电脑部件
 * @Date 2022/1/1
 **/
public interface ComputerPart {

    //提供给访问者
    public void accept(ComputerPartVisitor computerPartVisitor);
}
