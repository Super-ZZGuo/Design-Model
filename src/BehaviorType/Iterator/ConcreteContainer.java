package BehaviorType.Iterator;

/**
 * @Author zzguo
 * @Description 容器实现类
 * @Date 2022/1/1
 **/
public class ConcreteContainer implements Container{

    // 容器内部 元素
    private Integer[] items;

    public ConcreteContainer() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }
    // 容器创建迭代器
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }

}
