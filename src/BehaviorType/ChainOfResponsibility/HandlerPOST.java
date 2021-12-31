package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 处理POST请求
 * @Date 2021/12/31
 **/
public class HandlerPOST extends Handler {
    public HandlerPOST(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.POST) {
            System.out.println(request.getName() + " is handle by HandlerPOST");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}