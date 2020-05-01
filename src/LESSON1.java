import java.util.Scanner;

public class LESSON1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please input second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Select an action");
        double result;
        char action;
        action = scanner.next().charAt(0);
        switch (action) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Error.Try again .");
                return;
            }
        }
        System.out.print(result);

    }

}
