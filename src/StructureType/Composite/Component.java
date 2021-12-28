package StructureType.Composite;

/**
 * @Author zzguo
 * @Description 抽象类
 * @Date 2021/12/28
 **/
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
