package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 接口 责任链
 * @Date 2021/12/31
 **/

public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}