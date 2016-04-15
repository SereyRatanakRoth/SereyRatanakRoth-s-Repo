
package cointoss;
import java.util.Scanner;
public class CoinToss {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess (0  for head or 1 for tail): ");
        int guessCoin = input.nextInt();
        int coin = (int)(Math.random() * 2);
        String correct; 
        
        if (coin == 0)
            correct = "head";
        else 
            correct = "tail";
        
        if (guessCoin == coin)
            System.out.println("You guessed correctly.");
        else 
            System.out.println("Your guess was wrong. It's actually " + correct + " .");
    
    }
    
}

