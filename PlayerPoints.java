import java.util.Random;

public class PlayerPoints {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int player_1 = 0;
        int player_2 = 0;
        Random rand = new Random();
        int t = 1;        
        while ((player_1 <= 40) || (player_2 <= 40)) {
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
                    System.out.println("Player 1 has Rolled "+ Dice1+" and "+Dice2+System.lineSeparator()+"Player 1 has "+ player_1+" points"+System.lineSeparator());
                    System.out.println("Now its Player 2's turn");
                }
                //Player2 result
                else if(t==2) {
                    player_2 = player_2 + Dice1 + Dice2;
                    t--;
                    System.out.println("Player 2 has Rolled "+ Dice1+" and "+Dice2+System.lineSeparator()+"Player 2 has "+ player_2+" points"+System.lineSeparator());
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
