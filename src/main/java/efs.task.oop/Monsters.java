public class Monsters {
    
    static final Monster andariel = new Monster(10,70) {
        public void attack(Fighter victim)
        {
            victim.takeHit(this.getDamage());
        }
        public void takeHit(int damage)
        {
            this.setHealth(this.getHealth()-damage);
            monstersHealth -= damage;
        }
    };
    
    static final Monster blacksmith = new Monster(100,25) {
        public void attack(Fighter victim)
        {
            victim.takeHit(this.getDamage());
        }
        public void takeHit(int damage)
        {
            this.setHealth(this.getHealth()-(5+damage));
            monstersHealth -= 5+damage;
        }
    };
    static public int monstersHealth = blacksmith.getHealth()+andariel.getHealth();
}
