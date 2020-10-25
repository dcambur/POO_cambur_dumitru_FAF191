package oop.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File express1 = new File("/home/dima/IdeaProjects/oop_labs/src/oop/lab4/one_expression.txt");
        File express2 = new File("/home/dima/IdeaProjects/oop_labs/src/oop/lab4/three_expressions.txt");

        // Change express variable in scanner to change file with expression/expressions.
        Scanner scanExpression = new Scanner(express1);
        String expressionOutput;

        while (scanExpression.hasNextLine()) {
            expressionOutput = scanExpression.nextLine();
            String s = Balanced.checkBalancedParentesis(expressionOutput);
            if (s.equals("Proceeding to step two")) {
                System.out.println("Expression is balanced. " + s + ". Generating RPN" +"\n");
                String rpn = ShuntingYard.postfix(expressionOutput);
                System.out.println("RPN: " + rpn);
                System.out.println("RPN was generated successfully. Proceeding to step three. Solving: ");
                RPN.evalRPN(rpn);
            }
            else {
                System.out.println(s);
            }
        }
    }
}
