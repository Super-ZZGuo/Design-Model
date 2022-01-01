package BehaviorType.Interpreter;

import java.util.StringTokenizer;

/**
 * @Author zzguo
 * @Description 表达式分隔符号处理
 * @Date 2022/1/1
 **/
public class TerminalExpression implements Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        // 判断是否有默认分隔符
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
