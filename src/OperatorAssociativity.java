public class OperatorAssociativity {

    static char op;

    public OperatorAssociativity(char op) {
        this.op = op;
    }

    static boolean isLeftAssociative(char op){
        switch (op){
            case '^': return false;
            case '*':
            case '/':
            case '+' :
            case '-':
               return true;
        }
        return false;
    }
}
