package BehaviorType.ChainOfResponsibility;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2021/12/31
 **/
public class Client {

    public static void main(String[] args) {
        // 责任链处理顺序 GET->POST->PUT—>DELETE
        Handler handler4 = new HandlerDELETE(null);
        Handler handler3 = new HandlerPUT(handler4);
        Handler handler2 = new HandlerPOST(handler3);
        Handler handler1 = new HandlerGET(handler2);

        // 模拟四种请求
        Request request1 = new Request(RequestType.GET, "GETRequest");
        Request request2 = new Request(RequestType.POST, "POSTRequest");
        Request request3 = new Request(RequestType.PUT, "PUTRequest");
        Request request4 = new Request(RequestType.DELETE, "DELETERequest");

        // 分别交给handler1处理
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
        handler1.handleRequest(request4);

        // 可以在控制台 看到 按照责任链顺序 分别处理请求
    }
}
