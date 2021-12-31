package BehaviorType.ChainOfResponsibility;/*
@date 2021/12/31 - 1:49 下午
*/

public class Request {
    // 请求类型
    private RequestType type;

    // 请求名字
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
