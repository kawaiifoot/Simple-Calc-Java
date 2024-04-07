
import javax.swing.JOptionPane;

public class Main {
    static int addition(int a, int b) {
        return a + b;
    }
    static int subtraction(int a, int b) {
        return a - b;
    }
    static int multiplication(int a, int b) {
        return a * b;
    }
    static int division(int a, int b) {
        return a / b;
    }
    static int mod(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {

        int method = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Choose your method: \
                 1. Addition\s
                 2. Subtract\s
                 3. Divide\s
                 \
                4. Multiply\s
                 5. Mod"""));


        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number:"));

        int total;
        switch(method) {

            case 1:
                total = addition(a,b);
                JOptionPane.showMessageDialog(null, "The result is: " +total);
            break;

            case 2:
                total = subtraction(a,b);
                JOptionPane.showMessageDialog(null, "The result is: " +total);
            break;

            case 3:
                total = division(a,b);
                JOptionPane.showMessageDialog(null, "The result is: " +total);
            break;

            case 4:
                total = multiplication(a,b);
                JOptionPane.showMessageDialog(null, "The result is: " +total);
            break;

            case 5:
                total = mod(a,b);
                JOptionPane.showMessageDialog(null, "The result is: " +total);
            break;
        }



    }
}