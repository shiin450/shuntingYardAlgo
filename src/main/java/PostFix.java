import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PostFix {

    List<Character> infinixForm;
    private Stack<Character> stack = new Stack<>();
    private Queue<Character> queue = new LinkedList<>();

    public  Queue<Character> infinixProcess( List<Character> list) {

        for (char c : list){
            if(Character.isDigit(c)){
                queue.add(c);
            }
            else if (isMathOperator(c) && stack.empty()) {
                stack.push(c);
            }
            else if (isLeftParentheses(c) ){
                stack.push(c);
            }
            else if (isMathOperator(c) && isLeftParentheses((Character) stack.peek())){
                stack.push(c);
            }
            else if (isMathOperator(c) && isMathOperator((Character) stack.peek())) {
                while (!stack.empty() && ((OperatorPrecedence.opPrecedence((Character) stack.peek()) > OperatorPrecedence.opPrecedence(c))
                        || ((OperatorPrecedence.opPrecedence((Character) stack.peek()) == OperatorPrecedence.opPrecedence(c))
                        && OperatorAssociativity.isLeftAssociative(c))))
                {
                    queue.add(stack.pop());
                }
                stack.push(c);
            }

            else if(isRightParentheses(c)){
                while (!stack.isEmpty() && (Character)stack.peek() != '(') {
                    queue.add(stack.pop());
                }
                stack.pop(); // Pop the '('
            }

        }

        while (!stack.empty()){
            queue.add(stack.pop());
        }
        return queue;
    }

    public static boolean isMathOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    public static boolean isLeftParentheses(char c) {
        return c == '(';
    }

    public static boolean isRightParentheses(char c) {
        return c == ')';
    }
}
