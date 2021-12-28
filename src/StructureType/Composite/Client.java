package StructureType.Composite;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/28
 **/
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        //第一层节点
        root.add(node1);
        root.add(node2);
        root.add(node3);

        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");
        Component node221 = new Leaf("221");
        //第二层节点
        node2.add(node21);
        node2.add(node22);
        //第三层节点
        node22.add(node221);

        root.print();
    }
}