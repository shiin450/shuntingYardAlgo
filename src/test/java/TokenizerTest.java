import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TokenizerTest {



    @Test
    void returnStringsTokenized() {
        List<Character> stringTokens = Tokenizer.tokens("(2+2)*(3/2)-3^2");
        List<Character> stringsTokenized = List.of('(', '2', '+', '2', ')','*', '(', '3','/', '2', ')','-', '3', '^','2');
        assertEquals(stringsTokenized, stringTokens);

    }
}