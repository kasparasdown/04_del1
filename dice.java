//Starten af vores kode:
class dice {
public static void main(String[] args) {

    int min = 1;
    int max = 6;
    int Dice1 = (int)Math.floor(Math.random() *(max - min + 1) + min);
    int Dice2 = (int)Math.floor(Math.random() *(max - min + 1) + min);
    int sum = Dice2 + Dice1;
    System.out.println("Dice 1: "+Dice1);
    System.out.println("Dice 2: "+Dice2);
    System.out.println("sum: :" +sum);
    
}
}