import java.util.Scanner;
public class HelloWorld1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        int value = input.nextInt();
        System.out.println("you entered: "+ value);
    }
}
