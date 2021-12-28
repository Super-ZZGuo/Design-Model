package StructureType.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zzguo
 * @Description 组合节点
 * @Date 2021/12/28
 **/
public class Composite extends Component {

    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        //因此组合对象的操作可以委托给组件对象(可以是另一个组合对象或叶子结点)去处理
        System.out.println("Composite:" + name);
        for (Component component : child) {
            component.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }
}