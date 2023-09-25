//Starten af vores kode:
class dice {
public static void main(String[] args) {

    var scanner = new java.util.Scanner(System.in);

    int min = 1;
    int max = 6;
    int player_1 = 0;
    int player_2 = 0;
    while (1>0) {
        System.out.println("It's Player 1's turn, press r to roll: ");
        var n = scanner.nextLine();
        if (n.equals("r")) {
            int Dice1 = (int)Math.floor(Math.random() *(max - min + 1) + min);
            int Dice2 = (int)Math.floor(Math.random() *(max - min + 1) + min);

            player_1 = player_1 + Dice1 + Dice2;
            System.out.println("Player 1 has Rolled "+ Dice1+" and "+Dice2);
            System.out.println("Player 1 has "+ player_1+" points");

            }
        }       
    }
}