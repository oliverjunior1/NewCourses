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
        */
        //--------------------c - short hand if else --------------------
        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result);

    }
}