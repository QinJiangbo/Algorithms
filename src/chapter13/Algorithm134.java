package chapter13;

import java.util.Stack;

/**
 * 这个类描述Dijkstra的双栈算数表达式算法
 * Date: 9/11/16
 * Author: qinjiangbo@github.io
 */
public class Algorithm134 {

    private static Stack<String> ops = new Stack<String>();
    private static Stack<Double> vals = new Stack<Double>();

    /**
     * 计算算数表达式
     *
     * @param expression
     */
    public static double compute(String expression) {
        String[] expArr = expression.split("");
        for (String s: expArr) {
            if(s.trim().isEmpty()) continue;
            else if(s.equals("(")) continue;
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("-")) ops.push(s);
            else if(s.equals("/")) ops.push(s);
            else if(s.equals("*")) ops.push(s);
            else if(s.equals("sqrt")) ops.push(s);
            else if(s.equals(")")) {
                double result = 0.0;
                String op = ops.pop();
                double rightVal = vals.pop();
                if(op.equals("+")) result = vals.pop() + rightVal;
                if(op.equals("/")) result = vals.pop() / rightVal;
                if(op.equals("-")) result = vals.pop() - rightVal;
                if(op.equals("*")) result = vals.pop() * rightVal;
                if(op.equals("sqrt")) result = Math.sqrt(rightVal);
                vals.push(result);
            }
            else {
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String expression = "(1 - ((1 * 7) + (5 / 2)))";
        System.out.println(compute(expression));
    }

}
