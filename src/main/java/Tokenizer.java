import java.util.List;
import java.util.stream.Collectors;

public class Tokenizer {

    public static List<Character> tokens(String infinix){
        List<Character> infinixTokens = infinix.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        return infinixTokens;
    }
}
