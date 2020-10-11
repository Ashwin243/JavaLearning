public class Player {
    public String name;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        this.health = health - damage;
        if(this.health <= 0) {
            System.out.println("Player is knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
