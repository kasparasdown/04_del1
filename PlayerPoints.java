import java.util.Random;

public class PlayerPoints {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int player_1 = 0;
        int player_2 = 0;
        Random rand = new Random();
        int t = 1; 
        System.out.println("Player 1 starts");       
        while (true) {
            System.out.println("Press r to roll: "); 
            var n = scanner.nextLine();

            if (n.equals("r")) {
                //Dices
                int Dice1 = rand.nextInt(6) +1;
                int Dice2 = rand.nextInt(6) +1;

                //Player1 result
                if(t==1) {
                    player_1 = player_1 + Dice1 + Dice2;
                    t++;
                    System.out.println("Player 1 has Rolled " + Dice1 + " and " + Dice2 + "\nPlayer 1 has " + player_1 + " points");
                    if (player_1 >= 40) {
                        System.out.println("\nPlayer 1 has won the game");
                        break;
                    }
                    if (Dice1 == Dice2) {
                        System.out.println("Hooray! You just got both dice of the same value. You get an extra turn:)");
                    continue;
                    }
                    System.out.println("\nNow its Player 2's turn");
                    t++;
                }
                //Player2 result
                else if(t==2) {
                    player_2 = player_2 + Dice1 + Dice2;
                    t--;
                    System.out.println("Player 2 has Rolled " + Dice1 + " and " + Dice2 + "\nPlayer 2 has " + player_2 + " points"+System.lineSeparator());
                    if (player_2 >= 40){
                        System.out.println("\nPlayer 2 has won the game");
                        break;
                    }
                    if (Dice1 == Dice2) {
                        System.out.println("Hooray! You just got both dice of the same value. You get an extra turn:)");
                    continue;
                    }
                    System.out.println("Now its Player 1's turn");
                    t--;
                }
                else{
                    System.out.println("ERROR CODE");
                }
    
            }
        }
        scanner.close();        
    }
}
