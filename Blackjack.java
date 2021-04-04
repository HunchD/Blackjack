// BASIC BLACKJACK WITH NUMBERS
import java.util.*;
public class Blackjack {
   
	public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        int player_card1, player_card2,player_total, player_temp, dealer_card1,dealer_card_hidden,dealer_total, dealer_temp;
        String reply;
        System.out.println("BlackJack");
        System.out.println("");
        player_card1 = 2 + rng.nextInt(10);
        player_card2 = 2 + rng.nextInt(10);
        dealer_card1 = 2 + rng.nextInt(10);
        dealer_card_hidden = 2 + rng.nextInt(10);
        dealer_total = dealer_card1 + dealer_card_hidden;
        player_total = player_card1 + player_card2;
        System.out.println("You  get a "+player_card1+" and a "+player_card2);
        System.out.println("Your total is "+player_total);
        System.out.println("");
        System.out.println("The dealer has a "+dealer_card1+" and a hidden card");
        System.out.println("the total is hidden too");
        
        System.out.println("");
        System.out.print("Would you like to \"hit\" or \"stay\"? ");
        reply = keyboard.next();
        
        while(reply.equalsIgnoreCase("hit"))
        {
            
            player_temp = 2 + rng.nextInt(10);
            System.out.println("You drew a "+player_temp);
            player_total = player_total + player_temp;
            System.out.println("Your total is "+player_total);
            System.out.println("");
            
            if(player_total > 21)
            {
                break;
            }
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            reply = keyboard.next();

        }



        System.out.println("");;
        System.out.println("Okay, Dealer's turn ");
        System.out.println("His hidden card was "+dealer_card_hidden);
        System.out.println("His total was "+dealer_total);


        while(dealer_total<16)
        {
            
            System.out.println("");
            System.out.println("Dealer chooses to hit");
            dealer_temp = 2 + rng.nextInt(10);
            System.out.println("He draws a "+dealer_temp);
            dealer_total = dealer_total + dealer_temp;
            System.out.println("His total is "+dealer_total);

        }
        System.out.println("\nDealer stays");
        System.out.println("\nDealer's total is "+dealer_total);
        System.out.println("Your total is "+player_total);

        System.out.println("");
        if(player_total>21)
        {
            System.out.println("YOU BUST AND THE DEALER WINS !");
        }
        else if(dealer_total>21)
        {
            System.out.println("DEALER BUSTS AND YOU WIN !");
        }
        else if(player_total>dealer_total)
        {
            System.out.println("YOU WIN !");
        }
        else
        {
            System.out.println("DEALER WINS !");
        }
        if(player_total == dealer_total)
        {
            System.out.println("IT IS A TIE !");
        }
        keyboard.close();
    }
}
    
