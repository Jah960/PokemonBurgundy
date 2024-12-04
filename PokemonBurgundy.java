import java.util.Scanner;


public class PokemonBurgundy {
    public static void main(String[] args) {


        Pokemon player1 = new Pokemon();
        player1.name = "Pikachu";
        player1.type = "Electric";
        player1.attack = 10;
        player1.health = 45;
        player1.pp = 15;


        Pokemon player2 = new Pokemon();
        player2.name = "Charmander";
        player2.type = "Fire";
        player2.health = 35;
        player2.attack = 12;
        player2.pp = 15;


        int npcPotion = 3;


        Scanner keyboard = new Scanner(System.in);
        int choice;




        while(player1.health > 0 && player2.health > 0 ) {
            //player 1 goes
            //player1.attacks(player2);
            System.out.println(player1.name + "'s turn");
            System.out.println("(1) Attack");
            System.out.println("(2) Drink potion");
            System.out.println("(3) Run away!");
            System.out.println("(4) Use ultimate! ");
            choice = keyboard.nextInt();
            if(choice == 1){
                player1.attacks(player2);
            }
            else if(choice == 2){
                int potionLevel;
                System.out.println("what level of potion? 1, 2, or 3");
                potionLevel = keyboard.nextInt();
                player1.usePotion(potionLevel);
            }
            else if(choice == 3){
                player1.runAway();


            }
            else if(choice == 4){
                player1.specialAttack(player2);
            }
            if(player2.health < 0){
                break;
            }
            //player 2 goes
           /* System.out.println(player2.name + "'s turn");
            System.out.println("(1) attack");
            System.out.println("(2) drink potion");
            System.out.println("(3) Run away!");
            choice = keyboard.nextInt();


            if(choice == 1){
                player2.attacks(player1);
            }
            else if(choice == 2){
                int potionLevel;
                System.out.println("what level of potion? 1, 2, or 3");
                potionLevel = keyboard.nextInt();
                player2.usePotion(potionLevel);
            }
            else if(choice == 3){
                player2.runAway();
            }


          */
            //player2.attacks(player1);
            if(player2.health > 20){
                player2.attacks(player1);
            }
            else if(player2.health > 5){
                player2.usePotion(3);
            }
            if(npcPotion > 0){
                int randomPotionLevel = (int)(Math.random()*3)+1;
                player2.usePotion(randomPotionLevel);
                npcPotion--;
            }
            else{
                player2.runAway();
            }
        }
        if(player1.health < 0){
            System.out.println("player 2 won!");
        }
        else if(player2.health < 0){
            System.out.println("player 1 won!");
        }


      /* player1.usePotion(2);
       System.out.println(player1.name + " attacks " + player2.name);
       int damage = player1.damageDealt();
       System.out.println("They did " + damage +" " + player1.type + " damage");
       player2.health = player2.health - damage;
       System.out.println("player 2 now has " +player2.health + "hp");
       */


    }
}
