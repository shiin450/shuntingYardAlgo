import java.util.List;
import java.util.Queue;

public class shutingYardApp {

    public static void main(String[] args){
        
      String testText= "(2+2)+(2*2)";
      List<Character> chars = Tokenizer.tokens(testText);
        System.out.println(chars);
        Queue<Object> processed = PostFix.infinixProcess(chars);

        System.out.println("Queue: " + processed);
    }
}
