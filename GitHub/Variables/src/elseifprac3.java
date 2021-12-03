import java.util.Scanner;
public class elseifprac3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much do you weigh?");
        int wt = myObj.nextInt();
        System.out.println("Which planet are you going to?" +
                " 1. Venus " +
                " 2. Mars " +
                " 3. Jupiter " +
                " 4. Saturn " +
                " 5. Uranus " +
                " 6. Neptune ");
        int optionchoose = myObj.nextInt();
        int mult = 0;
        if(optionchoose == 1) mult = (int) (wt * 0.78);
        if(optionchoose == 2) mult = (int) (wt * 0.39);
        if(optionchoose == 3) mult = (int) (wt * 2.65);
        if(optionchoose == 4) mult = (int) (wt * 1.17);
        if(optionchoose == 5) mult = (int) (wt * 1.05);
        if(optionchoose == 6) mult = (int) (wt * 1.23);
        System.out.println(mult);
        System.out.println("Your weight in pounds on that planet would be " + mult);
    }
}
