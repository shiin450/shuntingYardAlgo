import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class postfixEvaluator {

    private Queue<Object> queue = new LinkedList<>();
    private Stack<Object> stack = new Stack<>();
    private float secondOperand;
    private float firstOperand;

    public String evaluator(Queue<Character> queue){
        while (!queue.isEmpty()) {
            Character item = queue.poll();
            if(Character.isDigit(item)){
                stack.push(Float.parseFloat(item.toString()));
            }
            else if (isMathOperator((Character) item)){
                secondOperand = (float) stack.pop();
                firstOperand = (float) stack.pop();
                stack.push(calculate(secondOperand,firstOperand, (Character) item));
            }

        }
        return stack.pop().toString();
    }

    private double calculate(float secondOperand, float firstOperand, char operator){
        switch (operator){
            case '^': return Math.pow(secondOperand, firstOperand);
            case '*': return secondOperand * firstOperand;
            case '/':
                try{
                    return secondOperand/firstOperand;
                } catch (ArithmeticException e){
                    System.out.println("Error: Division by zero");
                }

            case '+' : return secondOperand + firstOperand;
            case '-': return secondOperand - firstOperand;

            default: return operator;
        }
    }
    public static boolean isMathOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
   }


