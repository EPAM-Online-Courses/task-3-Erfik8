package efs.task.oop;

public class Villager implements Fighter{
    public String name;
    public int age;
    private int health;
    private int damage;

    public Villager(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.health = 100;
        this.damage = (int)(100 - this.age * 0.5)/10;
    }

    public void sayHello()
    {
        System.out.println("Greetings traveler... I'm "+this.name+" and I'm "+this.age+" years old");
    }
    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public void setHealth(int health){this.health = health;}
    public void setDamage(int damage){this.damage = damage;}
    public String getName(){return this.name;}

    public void attack(Fighter victim)
    {
        victim.takeHit(this.getDamage());
    }
    public void takeHit(int damage)
    {
       this.setHealth(this.getHealth()-damage);
    }

}
