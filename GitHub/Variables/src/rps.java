import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();
        // Computer random gen answer 0-2
        System.out.println("RPS: " +
                " 0-Scissors" +
                " 1-Paper" +
                " 2-Rock");
        int random = rand.nextInt(3);
        int usrinpt = myObj.nextInt();
        System.out.println("You used: " + usrinpt);
        if (usrinpt == 1 && random == 2){
            System.out.println("You win! Computer chose " + random);
        }
        if (usrinpt == 2 && random == 0){
            System.out.println("You win! Computer chose " + random);
        }
        if (usrinpt == 0 && random == 1){
            System.out.println("You win! Computer chose " + random);
        }
        if (random == 1 && usrinpt == 2){
            System.out.println("You lose! Computer chose " + random);
        }
        if (random == 2 && usrinpt == 0){
            System.out.println("You lose! Computer chose " + random);
        }
        if (random == 0 && usrinpt == 1){
            System.out.println("You lose! Computer chose " + random);
        }

    }
}
