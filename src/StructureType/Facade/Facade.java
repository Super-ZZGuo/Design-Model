package StructureType.Facade;

/**
 * @Author zzguo
 * @Description 对于客户端来说的统一接口，封装繁琐内部
 * @Date 10:56 下午 2021/12/27
 **/
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.starWatching();
    }
}
