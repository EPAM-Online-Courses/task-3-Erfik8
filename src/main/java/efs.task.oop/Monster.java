package efs.task.oop;

abstract class Monster implements Fighter{
    private int health;
    private int damage;

    public Monster(int health, int damage)
    {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public void setHealth(int health){this.health = health;}
    public void setDamage(int damage){this.damage = damage;}
}
