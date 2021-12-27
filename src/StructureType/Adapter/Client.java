package StructureType.Adapter;

/**
 * @Author zzguo
 * @Description 客户端 火鸡适配鸭子quack()方法
 * @Date 12:15 上午 2021/12/28
 **/
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}