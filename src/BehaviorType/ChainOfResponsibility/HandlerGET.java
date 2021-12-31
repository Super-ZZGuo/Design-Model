package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 处理GET请求
 * @Date 2021/12/31
 **/
public class HandlerGET extends Handler{
    public HandlerGET(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.GET) {
            System.out.println(request.getName() + " is handle by HandlerGET");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}