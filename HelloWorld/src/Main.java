import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write first number: ");
        num1 = sc.nextInt();
        System.out.print("Write second number: ");
        num2 = sc.nextInt();
        System.out.println("Operation (+,-,*,/):");
        String operation = sc.next();
        switch (operation){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                if(num2!=0) {
                    result = num1 / num2;
                }else{
                    System.out.println("Can't divide number with 0.");
                    return;
                }
                break;
            default:
                System.out.println("Wrong operation");
                return;
        }
        System.out.println("Sum of first and second number is "+result);
    }
}