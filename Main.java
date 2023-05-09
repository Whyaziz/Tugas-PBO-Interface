public class Main {
    public static void main(String[] args) {

        Potion healPt = new Potion("Asklepios Potion", "S", 1000, 2, 60, "heal");
        Potion attackPt = new Potion("Thanatos Potion", "S", 1000, 6, 15, "attack");
        Sword sword = new Sword("Excalibur", "S", 9800, 55);
        Shield shield = new Shield("Svalinn", "S", 6500, 60);

        healPt.use();
        attackPt.use();
        sword.use();
        shield.use();
    }
}