package efs.task.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Villager> villagerList = new ArrayList<>();
        villagerList.add(new Villager("Kashya",30));
        villagerList.add(new ExtraordinaryVillager("Akara",40,ExtraordinaryVillager.Skill.SHELTER));
        villagerList.add(new Villager("Gheed",50));
        villagerList.add(new ExtraordinaryVillager("Deckard Cain",85,ExtraordinaryVillager.Skill.IDENTIFY));
        villagerList.add(new Villager("Warriv",35));
        villagerList.add(new Villager("Flawia",25));
        villagerList.add(new Villager("Staszek",52));
        for (int i = 0 ; i < 7; i++)
        {
            villagerList.get(i).sayHello();
        }
        Object objectDeckardCain = villagerList.get(1);
        Object objectAkara = villagerList.get(3);

        Random rand = new Random(0);
        
        
        
        while(true)
        {
          int indexOfVillager = rand.nextInt(7);
          if(villagerList.get(indexOfVillager).getHealth() <= 0)
          {
            System.out.println("Osadnik o imieniu "+villagerList.get(indexOfVillager).getName()+" zaliczył zgona");
            continue;
          }
          //Monsters attack
          if(Monsters.andariel.getHealth() > 0) Monsters.andariel.attack(villagerList.get(indexOfVillager));
          if(villagerList.get(indexOfVillager).getHealth() > 0) villagerList.get(indexOfVillager).attack(Monsters.andariel);
          else 
          {
            System.out.println("Osadnik o imieniu "+villagerList.get(indexOfVillager).getName()+" zaliczył zgona");
            continue;
          }
          if(Monsters.blacksmith.getHealth() > 0) Monsters.blacksmith.attack(villagerList.get(indexOfVillager));
          if(villagerList.get(indexOfVillager).getHealth() > 0) villagerList.get(indexOfVillager).attack(Monsters.blacksmith);
          else 
          {
            System.out.println("Osadnik o imieniu "+villagerList.get(indexOfVillager).getName()+" zaliczył zgona");
            continue;
          }
          System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
          System.out.println("Aktualnie walczacy osadnik to "+villagerList.get(indexOfVillager).getName());
          
          if(Monsters.monstersHealth <=0 )
          {
            System.out.println("Obozowisko ocalone!");
            break;
          }
        }
        villagerList.set(1,(ExtraordinaryVillager)objectDeckardCain);
        villagerList.set(3,(ExtraordinaryVillager)objectAkara);

        
      }
      
    }
