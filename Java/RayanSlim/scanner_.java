package Java.RayanSlim;
import java.util.Scanner;;

public class scanner_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name:");
        String name = sc.nextLine();
        System.out.println("How much money do you spend on coffe?\n");
        double coffee = sc.nextDouble();
        System.out.println("How much money do you spend on fast food?\n");
        double fastFood = sc.nextDouble();
        System.out.println("How many times a week do you buy a coffee?\n");
        int hmtCoffee = sc.nextInt();
        System.out.println("How many times a week do you buy fast food?\n");
        int hmtFastFood = sc.nextInt();
        double payCoffeeWeek = coffee * hmtCoffee;
        double payWeekFastFood = fastFood * hmtCoffee;


        System.out.printf("%s you pay for week U$ %.2f for coffee and U$ %.2f for fast food.", name, payCoffeeWeek, payWeekFastFood);

        sc.close();
    }
    
}
