import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write first number: ");
        int num1 = sc.nextInt();
        System.out.print("Write second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of first and second number is "+(num1+num2));
    }
}