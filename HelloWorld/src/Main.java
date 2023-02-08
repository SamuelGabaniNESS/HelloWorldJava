import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;
        int num1,num2,result = 0;
        while(running) {
            num1 = getNumber();
            num2 = getNumber();
            System.out.println("Operation (+,-,*,/):");
            String operation = sc.nextLine();
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Can't divide number with 0.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Wrong operation");
                    return;
            }
            System.out.println("Sum of first and second number is " + result);
            System.out.println("Do you wish to continue? Write(y/n)");
            String answer = sc.nextLine();
            if(answer.equals("n")){
                running = false;
            }
            System.out.println("=".repeat(30));
        }
    }

    public static int getNumber(){
        int num = 0;
        boolean rightInput = false;
        do {
            System.out.print("Write a number: ");
            try {
                num = Integer.parseInt(sc.nextLine());
                rightInput = false;
            } catch (Exception e) {
                System.out.print("\nNumber is not integer.");
                rightInput = true;
            }
        }while(rightInput);
        return num;
    }
}