package BehaviorType.Interpreter;

/**
 * @Author zzguo
 * @Description 客户端
 * @Date 2022/1/1
 **/
public class Client {
    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {
        // Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        // B Or C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A Or (B Or C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // D And (A Or (B Or C))
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args) {
        // 构造解析树
        Expression define = buildInterpreterTree();
        String context1 = "D A";
        String context2 = "D B B";
        // context1是否满足解析树规则
        System.out.println(define.interpret(context1));
        // context2是否满足解析树规则
        System.out.println(define.interpret(context2));
    }
}
