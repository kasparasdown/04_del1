import java.util.Random;

public class PlayerPoints {
    public static void main(String[] args) {
        
        //Creating variables and scanner
        var scanner = new java.util.Scanner(System.in);
        int player_1 = 0;
        int player_2 = 0;
        Random rand = new Random();
        int t = 1; 
        int win = 0; //6'er wincon

        //Let's the game go on until game is over, having a starting line saying who goes first.
        System.out.println("Player 1 starts");       
        while (true) {
            System.out.println("Press r to roll: "); 
            var n = scanner.nextLine();

            //if the input is the required argument for the command, roll the 2 dice
            if (n.equals("r")) {
                int Die1 = rand.nextInt(6) +1;
                int Die2 = rand.nextInt(6) +1;

                //Player1 result
                if(t==1) {
                    player_1 = player_1 + Die1 + Die2;
                    // Feature 1
                    if(Die1 + Die2 == 2) {
                        player_1 = 0;
                        System.out.println("Oh no! You rolled two 1's, you start over.");

                    }
                    System.out.println("Player 1 has Rolled " + Die1 + " and " + Die2 + "\nPlayer 1 has " + player_1 + " points");
                    // Feature 4
                    if (player_1 >= 40){
                        System.out.println("You have reached 40 now roll the same value on both dice to win the game.");
                    }
                    if ((player_1 >= 40) && (Die1 == Die2)) {
                        System.out.println("\nPlayer 1 has won the game");
                        break;
                    }
                    // Feature 2 & 3
                    if (Die1 == Die2) {
                        if ((Die1 + Die2 == 12) && (win == 1)) {
                            System.out.println("\nPlayer 2 has won the game");
                            break;                                                        
                        }
                        else if ((Die1 + Die2 == 12)) {
                            win++;
                        }
                        win=0;
                        System.out.println("You just got both dice of the same value. You get an extra turn:)");
                    continue;
                    }
                    System.out.println("\nNow its Player 2's turn");
                    t++;
                    win=0;
                }
                //Player2 result
                else if(t==2) {
                    player_2 = player_2 + Die1 + Die2;
                    // Feature 1
                     if(Die1 + Die2 == 2) {
                        player_2 = 0;
                        System.out.println("Oh no! You rolled two 1's, you start over.");
                     }

                    System.out.println("Player 2 has Rolled " + Die1 + " and " + Die2 + "\nPlayer 2 has " + player_2 + " points"+System.lineSeparator());
                    // Feature 4
                    if (player_2 >= 40){
                        System.out.println("You have reached 40 now roll the same value on both dice to win the game.");
                    }
                    if ((player_2 >= 40) && (Die1 == Die2)){
                        System.out.println("\nPlayer 2 has won the game");
                        break;
                    }
                    // Feature 2 & 3
                    if (Die1 == Die2) {
                        if ((Die1 + Die2 == 12) && (win == 1)) {
                            System.out.println("\nPlayer 2 has won the game");
                            break;                                                        
                        }
                        else if ((Die1 + Die2 == 12)) {
                            win++;
                        }
                        win=0;
                        System.out.println("You just got both dice of the same value. You get an extra turn:)");
                    continue;
                    }
                    System.out.println("Now its Player 1's turn");
                    t--;
                    win=0;
                }
                else{
                    System.out.println("ERROR CODE");
                }
            }
        }
        scanner.close();        
    }
}
