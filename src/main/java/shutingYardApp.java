import java.util.List;
import java.util.Queue;

public class shutingYardApp {

    public static void main(String[] args){
        
      String testText= "(1 + 2) x (3 - 4) x (5 ÷ 6)";
      List<Character> chars = Tokenizer.tokens(testText);
        System.out.println(chars);
        Queue<Character> processed = new PostFix().infinixProcess(chars);
        System.out.println("Queue: " + processed);
        System.out.println(postfixEvaluator.calculate(3.0,4.0,'-'));
        postfixEvaluator calculated = new postfixEvaluator();
        System.out.println(calculated.evaluator(processed));

    }
}
