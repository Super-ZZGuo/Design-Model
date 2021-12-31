package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 处理DELETE请求
 * @Date 2021/12/31
 **/
public class HandlerDELETE extends Handler{
    public HandlerDELETE(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.DELETE) {
            System.out.println(request.getName() + " is handle by HandlerDELETE");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

