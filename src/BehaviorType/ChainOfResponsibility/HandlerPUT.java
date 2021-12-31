package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 处理PUT请求
 * @Date 2021/12/31
 **/
public class HandlerPUT extends Handler{
    public HandlerPUT(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.PUT) {
            System.out.println(request.getName() + " is handle by HandlerPUT");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
