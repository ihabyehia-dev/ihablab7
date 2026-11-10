package ihab_lab7;
import java.util.Scanner;
public class main1 {

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr=c.nextLine();
        Charstack stack=new Charstack(expr.length());
        if (stack.isBalanced(expr)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}
