
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        String value = input.next();
        System.out.println("you entered: "+ value);
    }
}
