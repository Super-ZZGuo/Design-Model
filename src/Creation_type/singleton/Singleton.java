package Creation_type.singleton;

/**
 * @Author zzguo
 * @Date 9:49 下午 2021/12/25
 **/


public class Singleton {

    //使用 volatile 可以禁止JVM的指令重排序
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    //饿汉式-线程安全 直接实例对象
    private static Singleton uniqueInstance1 = new Singleton();

    //懒汉式-线程不安全
    public static Singleton getUniqueInstance2() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //饿汉式-线程安全
    public static synchronized Singleton getUniqueInstance3() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //饿汉式-线程安全下的双重校验锁
    public static Singleton getUniqueInstance4(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                //防止两个线程同时进入后创建两个实例
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
