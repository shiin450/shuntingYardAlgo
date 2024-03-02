import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class postfixEvaluator {

    private Queue<Object> queue = new LinkedList<>();
    private Stack<Object> stack = new Stack<>();
    private double rightOperand;
    private double leftOperand;

    public String evaluator(Queue<Character> queue){
        while (!queue.isEmpty()) {
            Character item = queue.poll();
            if(Character.isDigit(item)){
                stack.push(Double.parseDouble(item.toString()));
            }
            else if (isMathOperator((Character) item)){
                rightOperand = (double) stack.pop();
                leftOperand = (double) stack.pop();
                stack.push(calculate(leftOperand,rightOperand, (Character) item));
            }

        }
        return stack.pop().toString();
    }

    public static double calculate(double leftOperand, double rightOperand, char operator){
        switch (operator){
            case '^': return Math.pow(leftOperand, rightOperand);
            case '*':
            case 'x':return leftOperand * rightOperand;
            case '/':
            case '÷':
                try{
                    return leftOperand/rightOperand;
                } catch (ArithmeticException e){
                    System.out.println("Error: Division by zero");
                }

            case '+' : return leftOperand + rightOperand;
            case '-': return leftOperand - rightOperand;

            default: return operator;
        }
    }
    public static boolean isMathOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c =='x'|| c == '/' || c == '÷'||c == '^';
    }
   }


