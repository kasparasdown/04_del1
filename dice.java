//Starten af vores kode:
class dice {
public static void main(String[] args) {

    int min = 1;
    int max = 6;
    int random_int = (int)Math.floor(Math.random() *(max - min + 1) + min);
    System.out.println(random_int);
    
}
}