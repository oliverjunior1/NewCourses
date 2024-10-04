package Java.RayanSlim;
import java.util.Scanner;;

public class scanner_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.printf("Your name is %s", name);

        sc.close();
    }
    
}
