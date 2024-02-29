public class OperatorPrecedence {

   static char c;

    public OperatorPrecedence(char c) {
        this.c = c;
    }

    public static int opPrecedence(char operator){
        switch (operator){
            case '^': return 4;
            case '*':
            case '/':
                return 3;
            case '+' :
            case '-':
                return 2;
            default: return -1;
        }
    }
}
