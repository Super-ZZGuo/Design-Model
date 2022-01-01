package BehaviorType.Iterator;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2022/1/1
 **/
public class Client {

    public static void main(String[] args) {
        Container container = new ConcreteContainer();
        // 创建对应容器的迭代器
        Iterator<Integer> iterator = container.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
