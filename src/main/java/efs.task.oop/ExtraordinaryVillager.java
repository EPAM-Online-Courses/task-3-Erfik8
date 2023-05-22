package efs.task.oop;

public class ExtraordinaryVillager extends Villager{

    public enum Skill 
    {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");
    
        private String url;
    
        Skill(String envUrl) {
            this.url = envUrl;
        }
    
        public String getUrl() {
            return url;
        }
    }

    private Skill skill;
    public ExtraordinaryVillager(String name, int age, Skill skill){
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello()
    {
        System.out.println("Greetings traveler... I'm "+this.name+" and I'm "+this.age+" years old. "+this.skill.getUrl());
    }
    public void attack(Fighter victim)
    {
        victim.takeHit(0);
    }
    public void takeHit(int damage)
    {
       this.setHealth(0);
    }
    
}
