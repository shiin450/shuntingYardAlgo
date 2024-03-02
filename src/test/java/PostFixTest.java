
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostFixTest {

        @Test
        public void testInfinixProcess() {
            List<Character> input = Arrays.asList('(', '(', '1', '+', '2', ')', '*', '(', '3', '-', '4', ')', ')', '/', '(', '5', '+', '6', ')');
            Queue<Object> expectedOutput = new LinkedList<>();
            expectedOutput.add('1');
            expectedOutput.add('2');
            expectedOutput.add('+');
            expectedOutput.add('3');
            expectedOutput.add('4');
            expectedOutput.add('-');
            expectedOutput.add('*');
            expectedOutput.add('5');
            expectedOutput.add('6');
            expectedOutput.add('+');
            expectedOutput.add('/');
            Queue<Character> actualOutput = new PostFix().infinixProcess(input);
            assertEquals(expectedOutput, actualOutput);


        }
        @Test
        public void infinixProcessCase2(){
            List<Character> input2 = Arrays.asList('(', '1', '+', '2', ')', '*', '3');
            Queue<Object> expectedOutput2 = new LinkedList<>();
            expectedOutput2.add('1');
            expectedOutput2.add('2');
            expectedOutput2.add('+');
            expectedOutput2.add('3');
            expectedOutput2.add('*');
            Queue<Character> actualOutput2 = new PostFix().infinixProcess(input2);
            assertEquals(expectedOutput2, actualOutput2);
        }
        @Test
        public void infinixProcessCase3(){
            List<Character> input3 = Arrays.asList('(', '(', '1', '+', '2', ')', '*', '(', '3', '-', '4', ')', ')', '/', '(', '5', '+', '6', ')');
            Queue<Object> expectedOutput3 = new LinkedList<>();
            expectedOutput3.add('1');
            expectedOutput3.add('2');
            expectedOutput3.add('+');
            expectedOutput3.add('3');
            expectedOutput3.add('4');
            expectedOutput3.add('-');
            expectedOutput3.add('*');
            expectedOutput3.add('5');
            expectedOutput3.add('6');
            expectedOutput3.add('+');
            expectedOutput3.add('/');
            Queue<Character> actualOutput3 = new PostFix().infinixProcess(input3);
            assertEquals(expectedOutput3, actualOutput3);
        }

        @Test
        public void testIsMathOperator() {
            char operator = '+';
            boolean expected = true;
            boolean actual = PostFix.isMathOperator(operator);
            assertEquals(expected, actual);
        }

        @Test
        public void testIsLeftParentheses() {
            char parentheses = '(';
            boolean expected = true;
            boolean actual = PostFix.isLeftParentheses(parentheses);
            assertEquals(expected, actual);
        }

        @Test
        public void testIsRightParentheses() {
            char parentheses = ')';
            boolean expected = true;
            boolean actual = PostFix.isRightParentheses(parentheses);
            assertEquals(expected, actual);
        }


}
