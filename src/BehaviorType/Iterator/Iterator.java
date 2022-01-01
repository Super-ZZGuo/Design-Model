package BehaviorType.Iterator;

/**
 * @Author zzguo
 * @Description 迭代器
 * @Date 2022/1/1
 **/
public interface Iterator<Item> {
    Item next();

    boolean hasNext();
}
