package guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.print("Plz enter number:");
            number = scanner.nextInt();
            if (number < secret) {
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else
                System.out.println("Currect");
        }

/*        int i = 0;
        do {
            System.out.println(i);
            i++;

        } while (i < 3);*/

    }

}
