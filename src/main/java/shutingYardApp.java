import java.util.List;
import java.util.Queue;

public class shutingYardApp {

    public static void main(String[] args){
        
      String testText= "(1+2)*(3-4)";
      List<Character> chars = Tokenizer.tokens(testText);
        System.out.println(chars);
        Queue<Character> processed = new PostFix().infinixProcess(chars);
        System.out.println("Queue: " + processed);
        postfixEvaluator calculated = new postfixEvaluator();
        System.out.println(calculated.evaluator(processed));

    }
}
