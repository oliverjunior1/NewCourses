package Java;

public class Treinamento {
    public static void main(String[] args) {
        /*
        //a - Math 
        double x = Math.max(5,10);
        System.out.println(x);
        //------------------b - if else-----------------------------
        //
        
        int x = 20;
        if (x > 18) {
            System.out.println("You can drive, go on!");
        }
        else {
            System.out.println("You can't drive, left your car!");
        }
        
        //--------------------c - short hand if else --------------------
        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result);
        */
        //---------------------Switch-------------------------------------
        int day = 4;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a accepted number, type from 1 to 7.");
                break;
        
        }
    }
}