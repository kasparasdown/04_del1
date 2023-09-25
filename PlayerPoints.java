import java.util.Random;

public class PlayerPoints {
    public static void main(String[] args) {
        
        //Creating variables and scanner
        var scanner = new java.util.Scanner(System.in);
        int player_1 = 0;
        int player_2 = 0;
        Random rand = new Random();
        int t = 1; 

        //Let's the game go on until game is over, having a starting line saying who goes first.
        System.out.println("Player 1 starts");       
        while ((player_1 <= 40) && (player_2 <= 40)) {
            System.out.println("Press r to roll: "); 
            var n = scanner.nextLine();

            //if the input is the required argument for the command, roll the 2 dice
            if (n.equals("r")) {
                int Die1 = rand.nextInt(6) +1;
                int Die2 = rand.nextInt(6) +1;

                //Player1 result
                if(t==1) {
                    player_1 = player_1 + Die1 + Die2;
                    t++;
                    System.out.println("Player 1 has Rolled " + Die1 + " and " + Die2 + "\nPlayer 1 has " + player_1 + " points");
                    if (player_1 >= 40){
                        System.out.println("\nPlayer 1 has won the game");
                        break;
                    }
                    System.out.println("\nNow its Player 2's turn");
                }
                //Player2 result
                else if(t==2) {
                    player_2 = player_2 + Die1 + Die2;
                    t--;
                    System.out.println("Player 2 has Rolled " + Die1 + " and " + Die2 + "\nPlayer 2 has " + player_2 + " points"+System.lineSeparator());
                    if (player_2 >= 40){
                        System.out.println("\nPlayer 2 has won the game");
                        break;
                    }
                    System.out.println("Now its Player 1's turn");
                }
                else{
                    System.out.println("ERROR CODE");
                }
            }
        }
        scanner.close();        
    }
}
