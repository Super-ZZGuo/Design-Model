package StructureType.Facade;

/**
 * @Author zzguo
 * @Description 内部系统，包含一系列繁琐操作
 * @Date 10:57 下午 2021/12/27
 **/
public class SubSystem {

    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void starWatching(){
        System.out.println("starWatching()");
    }
}
