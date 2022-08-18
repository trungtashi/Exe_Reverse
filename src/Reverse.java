import java.util.Scanner;
import java.util.Stack;

public class Reverse {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            Stack<String> revertStack = new Stack<String>();
            for (int i = 0; i < string.length(); i++) {
                revertStack.push(string.charAt(i)+"");
            }
            for (int i = 0; i < string.length(); i++) {
                System.out.println(revertStack.pop());
            }
        }
}
