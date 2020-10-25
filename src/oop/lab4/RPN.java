package oop.lab4;
import java.util.LinkedList;

public class RPN {

    public static void evalRPN(String expr){
        LinkedList<Double> stack = new LinkedList<Double>();
        for (String token : expr.split("\\s")){
            System.out.print(token + "\t");
            switch (token) {
                case "*" -> {
                    System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand * secondOperand);
                    break;
                }
                case "/" -> {
                    System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand / secondOperand);
                    break;
                }
                case "-" -> {
                    System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand - secondOperand);
                    break;
                }
                case "+" -> {
                    System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(firstOperand + secondOperand);
                    break;
                }
                case "^" -> {
                    System.out.print("Operate\t\t");
                    double secondOperand = stack.pop();
                    double firstOperand = stack.pop();
                    stack.push(Math.pow(firstOperand, secondOperand));
                    break;
                }
                default -> {
                    System.out.print("Push\t\t");
                    try {
                        stack.push(Double.parseDouble(token + ""));
                    } catch (NumberFormatException e) {
                        System.out.println("\nError: invalid token " + token);
                        return;
                    }
                }
            }
            System.out.println(stack);
        }
        if (stack.size() > 1) {
            System.out.println("Error, too many operands: " + stack);
            return;
        }
        System.out.println("Final answer: " + stack.pop());
    }
}
