package oop.lab4;
import java.util.Stack;



public class Balanced {

    public static String checkBalancedParentesis(String expr)
    {
        if (expr.isEmpty())
            return "Proceeding to step two";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "Are parentheses put right?";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Are parentheses put right?";
            }
        }
        return stack.isEmpty()?"Proceeding to step two":"Are parentheses put right?";
    }

}