import java.util.Scanner;

public class elseifprac2 {
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your age?");
         int age = myObj.nextInt();

         if( age < 16 ){
             System.out.println("You can't drive.");
         }
         if( age == 17 ){
        System.out.println("You can drive but not vote.");
         }
        if( age == 16 ){
            System.out.println("You can drive but not vote.");
        }

        if( age > 17 && age < 25 ){
            System.out.println("You can vote but not rent a car.");
        }

        if( age > 25 ){
            System.out.println("You are god");
        }
        if( age == 25){
            System.out.println("You are god");
        }
    }
}
