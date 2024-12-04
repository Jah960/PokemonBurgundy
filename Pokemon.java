public class Pokemon {
    public String name;
    public String type;
    public int health;
    public int attack;
    public int pp;


    //attack
    public void specialAttack(Pokemon otherPokemon){
        if(pp >= 5){




            System.out.println(name + " Ultimate attacks " +otherPokemon.name);
            int damageDone = attack * 2;
            System.out.println(name + " did " + damageDone + " " +type+ " damage");
            otherPokemon.health = otherPokemon.health - damageDone;
            System.out.println(otherPokemon.name + " now has " +otherPokemon.health+ " hp.");
            pp = pp - 5;
        }
        else{
            System.out.println("Not enough pp to use this attack!");
        }


    }
    public void attacks(Pokemon otherPokemon){
        //5% chance for a miss
        //5% chance for a crit
        //90% chance for regular damage
        int randomChance = (int)(Math.random()*100)+1;
        if(randomChance <= 90) {




            System.out.println(name + " attacks " + otherPokemon.name);
            int damage = damageDealt();
            System.out.println(name + " did " + damage + " " + type + " damage");
            otherPokemon.health = otherPokemon.health - damage;
            System.out.println(otherPokemon.name + " now has " + otherPokemon.health + " hp.");
        }
        else if(randomChance <= 95){
            System.out.println(name + " attacks " + otherPokemon.name + " critically!");
            int damage = damageDealt() * 2;
            System.out.println(name + " did " + damage + " " + type + " damage");
            otherPokemon.health = otherPokemon.health - damage;
            System.out.println(otherPokemon.name + " now has " + otherPokemon.health + " hp.");
        }
        else{
            System.out.println(name + " missed " + otherPokemon.name);
        }


    }


    //calculate dmg
    //attk + (1-6)
    public int damageDealt(){
        int randomDamage = attack + (int)(Math.random()* 6)+1;
        return randomDamage;
    }


    //deal dmg


    //run away
    public void runAway(){
        System.out.println(name + " ran away!");
        System.exit(0);
    }
    //use Potion = heal 5 health
    public void usePotion(int level){
        System.out.println(name + " used a potion!");
        switch(level){
            case 2 -> health = health + 10;
            case 3 -> health = health + 15;
            default -> health = health + 5;
        }
        health = health + 5;
        System.out.println(name + " now has " + health + "hp");


    }


}
