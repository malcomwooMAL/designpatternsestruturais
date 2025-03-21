package strategy;

import java.util.Scanner;

public class StrategyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the action (addition, subtraction, multiplication): ");
        String action = scanner.next().toLowerCase(); // Converte para minúsculas

        Context context = new Context(new ConcreteStrategyAdd()); // Estratégia padrão: adição

        switch (action) {
            case "addition":
                // Já é a estratégia padrão, não precisa fazer nada
                break;
            case "subtraction":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiplication":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Invalid action.  Using addition by default.");
        }

        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);

        scanner.close(); // Fecha o scanner
    }
}
